package study.practice.practice49;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorFinder {

    public static void main(String[] args) {
        int deptno = 101; // 예시 부서번호
        List<Professor> list = findProfessorListByDeptno(deptno);

        for (Professor p : list) {
            System.out.println(p);
        }
    }

    public static List<Professor> findProfessorListByDeptno(int deptno) {
        List<Professor> professors = new ArrayList<>();

        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB 접속 정보 수정 필요
        String user = "your_username"; // 사용자 계정
        String password = "your_password";

        String sql = "SELECT profno, name, id, position, pay, deptno FROM professor WHERE deptno = ?";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, deptno);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Professor p = new Professor(
                        rs.getInt("profno"),
                        rs.getString("name"),
                        rs.getString("id"),
                        rs.getString("position"),
                        rs.getInt("pay"),
                        rs.getInt("deptno")
                    );
                    professors.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return professors;
    }
}

// DTO 클래스
class Professor {
    private int profno;
    private String name;
    private String id;
    private String position;
    private int pay;
    private int deptno;

    public Professor(int profno, String name, String id, String position, int pay, int deptno) {
        this.profno = profno;
        this.name = name;
        this.id = id;
        this.position = position;
        this.pay = pay;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "profno=" + profno +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", pay=" + pay +
                ", deptno=" + deptno +
                '}';
    }
}

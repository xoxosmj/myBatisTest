package user.service;

import user.bean.UserDTO;
import user.dao.UserDAO;

import java.util.Scanner;

public class UserInsertService implements UserService {

    @Override
    public void execute() {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력 : ");
        String name = sc.next();
        System.out.println("아이디 입력 : ");
        String id = sc.next();
        System.out.println("비밀번호 입력 : ");
        String pwd = sc.next();

        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        userDTO.setId(id);
        userDTO.setPwd(pwd);

        //DB
        UserDAO userDAO = UserDAO.getInstance();

    }
}

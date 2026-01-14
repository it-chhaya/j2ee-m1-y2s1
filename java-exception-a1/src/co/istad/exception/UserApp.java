package co.istad.exception;

import java.util.*;
import java.util.stream.Collectors;

public class UserApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<User> users = new ArrayList<>();

        do {
            System.out.print("Enter ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Enter role [ADMIN,USER]: ");
            String role = scanner.nextLine(); // ADMIN,USER

            Set<String> roles = Arrays.stream(role.split(","))
                    .collect(Collectors.toSet());

            User user = new User(id, username, email, password, roles);

            // Validate valid user

            users.add(user);

            users.forEach(data -> System.out.println("User: " + data));
        } while(true);
    }
}

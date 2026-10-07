import java.util.Random;
import java.util.Scanner;

public class DoWhileTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("\nВведите номер задания от 1 до 20 (для выхода введите 0): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Программа завершена. До свидания!");
                    break;
                case 1:  task1();         break;
                case 2:  task2();         break;
                case 3:  task3();         break;
                case 4:  task4();         break;
                case 5:  task5(scanner);  break;
                case 6:  task6(scanner);  break;
                case 7:  task7(scanner);  break;
                case 8:  task8(scanner);  break;
                case 9:  task9(scanner);  break;
                case 10: task10(scanner); break;
                case 11: task11(scanner); break;
                case 12: task12(scanner); break;
                case 13: task13(scanner); break;
                case 14: task14(scanner); break;
                case 15: task15(scanner); break;
                case 16: task16(scanner); break;
                case 17: task17(scanner); break;
                case 18: task18(scanner); break;
                case 19: task19(scanner); break;
                case 20: task20(scanner); break;
                default:
                    System.out.println("Неверный номер. Введите число от 0 до 20.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Задание 1. Вывод чисел от 1 до 10
    static void task1() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }

    // Задание 2. Обратный отсчёт от 10 до 1
    static void task2() {
        int i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
        System.out.println();
    }

    // Задание 3. Чётные числа от 2 до 20
    static void task3() {
        int i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
        System.out.println();
    }

    // Задание 4. Нечётные числа от 1 до 19
    static void task4() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 19);
        System.out.println();
    }

    // Задание 5. Сумма чисел от 1 до N
    static void task5(Scanner scanner) {
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("N должно быть больше 0.");
            return;
        }
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
    }

    // Задание 6. Таблица умножения
    static void task6(Scanner scanner) {
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }

    // Задание 7. Степень числа без Math.pow()
    static void task7(Scanner scanner) {
        System.out.print("Введите A: ");
        double a = scanner.nextDouble();
        System.out.print("Введите N (N >= 0): ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("N должно быть неотрицательным.");
            return;
        }
        double result = 1;
        int i = 0;
        if (n > 0) {
            do {
                result *= a;
                i++;
            } while (i < n);
        }
        System.out.println(a + "^" + n + " = " + result);
    }

    // Задание 8. Сумма цифр
    static void task8(Scanner scanner) {
        System.out.print("Введите целое число: ");
        long num = Math.abs(scanner.nextLong());
        long original = num;
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        System.out.println("Сумма цифр числа " + original + " = " + sum);
    }

    // Задание 9. Количество цифр
    static void task9(Scanner scanner) {
        System.out.print("Введите целое число: ");
        long num = Math.abs(scanner.nextLong());
        long original = num;
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num > 0);
        System.out.println("Количество цифр в числе " + original + " = " + count);
    }

    // Задание 10. Переворот числа
    static void task10(Scanner scanner) {
        System.out.print("Введите целое число: ");
        long num = Math.abs(scanner.nextLong());
        StringBuilder reversed = new StringBuilder();
        do {
            reversed.append(num % 10);
            num /= 10;
        } while (num > 0);
        System.out.println("Число наоборот: " + reversed);
    }

    // Задание 11. Факториал
    static void task11(Scanner scanner) {
        System.out.print("Введите N (0..20): ");
        int n = scanner.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("N должно быть от 0 до 20.");
            return;
        }
        long factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);
        System.out.println(n + "! = " + factorial);
    }

    // Задание 12. Палиндром
    static void task12(Scanner scanner) {
        System.out.print("Введите целое число: ");
        long num = Math.abs(scanner.nextLong());
        long original = num;
        long reversed = 0;
        do {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } while (num > 0);
        if (reversed == original) {
            System.out.println(original + " — палиндром");
        } else {
            System.out.println(original + " — не палиндром");
        }
    }

    // Задание 13. Поиск максимума (ввод до 0)
    static void task13(Scanner scanner) {
        System.out.println("Вводите числа (0 — конец ввода):");
        int max = Integer.MIN_VALUE;
        boolean hasNumbers = false;
        int num;
        do {
            num = scanner.nextInt();
            if (num != 0) {
                hasNumbers = true;
                if (num > max) {
                    max = num;
                }
            }
        } while (num != 0);
        if (hasNumbers) {
            System.out.println("Максимальное число: " + max);
        } else {
            System.out.println("Числа не были введены.");
        }
    }

    // Задание 14. Поиск минимума (ввод до 0)
    static void task14(Scanner scanner) {
        System.out.println("Вводите числа (0 — конец ввода):");
        int min = Integer.MAX_VALUE;
        boolean hasNumbers = false;
        int num;
        do {
            num = scanner.nextInt();
            if (num != 0) {
                hasNumbers = true;
                if (num < min) {
                    min = num;
                }
            }
        } while (num != 0);
        if (hasNumbers) {
            System.out.println("Минимальное число: " + min);
        } else {
            System.out.println("Числа не были введены.");
        }
    }

    // Задание 15. Положительные и отрицательные
    static void task15(Scanner scanner) {
        System.out.println("Вводите числа (0 — конец ввода):");
        int positive = 0;
        int negative = 0;
        int num;
        do {
            num = scanner.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        } while (num != 0);
        System.out.println("Положительных: " + positive);
        System.out.println("Отрицательных: " + negative);
    }

    // Задание 16. Угадай число
    static void task16(Scanner scanner) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("Я загадал число от 1 до 100. Угадай!");
        do {
            System.out.print("Ваш вариант: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secret) {
                System.out.println("Больше");
            } else if (guess > secret) {
                System.out.println("Меньше");
            }
        } while (guess != secret);
        System.out.println("Угадали! Число " + secret + ". Попыток: " + attempts);
    }

    // Задание 17. Пароль
    static void task17(Scanner scanner) {
        final String correctPassword = "java123";
        String input;
        do {
            System.out.print("Введите пароль: ");
            input = scanner.next();
            if (!input.equals(correctPassword)) {
                System.out.println("Неверный пароль, попробуйте ещё раз.");
            }
        } while (!input.equals(correctPassword));
        System.out.println("Доступ разрешён");
    }

    // Задание 18. Меню калькулятора
    static void task18(Scanner scanner) {
        int option;
        do {
            System.out.println("\n--- Калькулятор ---");
            System.out.println("1 — Сложение");
            System.out.println("2 — Вычитание");
            System.out.println("3 — Умножение");
            System.out.println("4 — Деление");
            System.out.println("0 — Выход");
            System.out.print("Выберите пункт: ");
            option = scanner.nextInt();

            if (option >= 1 && option <= 4) {
                System.out.print("Введите первое число: ");
                double a = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double b = scanner.nextDouble();

                switch (option) {
                    case 1: System.out.println("Результат: " + (a + b)); break;
                    case 2: System.out.println("Результат: " + (a - b)); break;
                    case 3: System.out.println("Результат: " + (a * b)); break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Ошибка: деление на ноль!");
                        } else {
                            System.out.println("Результат: " + (a / b));
                        }
                        break;
                }
            } else if (option != 0) {
                System.out.println("Неверный пункт меню.");
            }
        } while (option != 0);
        System.out.println("Выход из калькулятора.");
    }

    // Задание 19. Банковский счёт
    static void task19(Scanner scanner) {
        double balance = 10000;
        int option;
        do {
            System.out.println("\n--- Банковский счёт ---");
            System.out.println("1 — Пополнить счёт");
            System.out.println("2 — Снять деньги");
            System.out.println("3 — Показать баланс");
            System.out.println("0 — Выход");
            System.out.print("Выберите пункт: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Сумма пополнения: ");
                    double deposit = scanner.nextDouble();
                    if (deposit <= 0) {
                        System.out.println("Сумма должна быть больше 0.");
                    } else {
                        balance += deposit;
                        System.out.println("Счёт пополнен. Баланс: " + balance);
                    }
                    break;
                case 2:
                    System.out.print("Сумма снятия: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("Сумма должна быть больше 0.");
                    } else if (withdraw > balance) {
                        System.out.println("Недостаточно средств! Баланс: " + balance);
                    } else {
                        balance -= withdraw;
                        System.out.println("Деньги сняты. Баланс: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Текущий баланс: " + balance);
                    break;
                case 0:
                    System.out.println("Выход из банковского меню.");
                    break;
                default:
                    System.out.println("Неверный пункт меню.");
            }
        } while (option != 0);
    }

    // Задание 20. Камень, ножницы, бумага
    static void task20(Scanner scanner) {
        Random random = new Random();
        String[] names = {"Камень", "Ножницы", "Бумага"};
        int again;
        do {
            int player;
            do {
                System.out.print("Ваш выбор (1 — Камень, 2 — Ножницы, 3 — Бумага): ");
                player = scanner.nextInt();
            } while (player < 1 || player > 3);

            int computer = random.nextInt(3) + 1;
            System.out.println("Вы: " + names[player - 1] + " | Компьютер: " + names[computer - 1]);

            if (player == computer) {
                System.out.println("Ничья!");
            } else if ((player == 1 && computer == 2)
                    || (player == 2 && computer == 3)
                    || (player == 3 && computer == 1)) {
                System.out.println("Вы победили!");
            } else {
                System.out.println("Компьютер победил!");
            }

            System.out.print("Хотите сыграть ещё? (1 — Да, 0 — Нет): ");
            again = scanner.nextInt();
        } while (again != 0);
        System.out.println("Спасибо за игру!");
    }
}

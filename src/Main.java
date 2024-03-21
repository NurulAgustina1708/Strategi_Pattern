//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.System.out.println("i = " + i);

            abstract class Duck {
                void quack(){
                    System.out.println("Qwek Qwek");

                }
                void swim(){
                    System.out.println("Berenang");

                }
                abstract void display();

                void fly(){
                    System.out.println("Terbang");
                }
            }

            class MallardDuck extends Duck{
                @Override
                void display(){
                    System.out.println("Tampilan MallardDuck");
                }
            }

            class RubberdDuck extends Duck{
                @Override
                void display(){
                    System.out.println("Tampilan RedHeadDuck");
                }
            }

            class RubberDuck extends Duck{
                @Override
                void display(){
                    System.out.println("Bunyinya squeek, bukan qwak");
                }

                @Override
                void fly(){
                    //Tidak ada implementasi, karena bebek mainan t
                }
            }

            class WoodenDuck extends Duck {
                @Override
                void display(){
                    System.out.println("Tampilan WoodenDuck");
                }
                @Override
                void quack(){
                    //Tidak ada implementasi, karena bebek mainan t

                }
                @Override
                void swim(){
                    System.out.println("Mengambang");
                }

                @Override
                void fly(){
                    //Tidak ada implementasi, karena bebek mainan t
                }
            }
        }
    }
}
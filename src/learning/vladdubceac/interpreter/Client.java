package learning.vladdubceac.interpreter;

public class Client {
    public static Expression getMaleExpression(){
        Expression vasile = new TerminalExpression("Vasile");
        Expression ion = new TerminalExpression("Ion");
        return new OrExpression(vasile, ion);
    }

    public static Expression getMarriedWomanExpression(){
        Expression iulia = new TerminalExpression("Iulia");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(iulia, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context ic = new Context("Ion");
        System.out.println("Ion is male? "+isMale.interpret(ic));

        Context ic2 = new Context("Married Iulia");
        System.out.println("Iulia is a married woman? "+isMarriedWoman.interpret(ic2));

        Context ic3 = new Context("Lucia");
        System.out.println("Lucia is male? "+isMale.interpret(ic3));
    }
}

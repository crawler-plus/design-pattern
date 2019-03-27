package site.it4u.visitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}

//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "Minijava.print"
 * nodeToken1 -> "("
 * exp -> Exp()
 * nodeToken2 -> ")"
 * nodeToken3 -> ";"
 */
public @SuppressWarnings("all") class Print implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Exp exp;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;

   public Print(NodeToken n0, NodeToken n1, Exp n2, NodeToken n3, NodeToken n4) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = n1;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      exp = n2;
      if ( exp != null ) exp.setParent(this);
      nodeToken2 = n3;
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      nodeToken3 = n4;
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
   }

   public Print(Exp n0) {
      nodeToken = new NodeToken("Minijava.print");
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = new NodeToken("(");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      exp = n0;
      if ( exp != null ) exp.setParent(this);
      nodeToken2 = new NodeToken(")");
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      nodeToken3 = new NodeToken(";");
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
   }

   public void accept(mini.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(mini.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(mini.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(mini.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
   public void setParent(Node n) { parent = n; }
   public Node getParent()       { return parent; }
}


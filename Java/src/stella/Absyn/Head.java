// File generated by the BNF Converter (bnfc 2.9.4.1).

package stella.Absyn;

public class Head  extends Expr {
  public final Expr expr_;
  public int line_num, col_num, offset;
  public Head(Expr p1) { expr_ = p1; }

  public <R,A> R accept(stella.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof stella.Absyn.Head) {
      stella.Absyn.Head x = (stella.Absyn.Head)o;
      return this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return this.expr_.hashCode();
  }


}
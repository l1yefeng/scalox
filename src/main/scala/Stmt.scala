sealed trait Stmt {}

case class Block(statements: Array[Stmt])              extends Stmt
case class Expression(expr: Expr)                      extends Stmt
case class Print(expr: Expr)                           extends Stmt
case class Var(name: Token, initializer: Option[Expr]) extends Stmt
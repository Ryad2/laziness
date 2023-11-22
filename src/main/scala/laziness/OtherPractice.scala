package laziness

import MyLazyList.*
import laziness.MyLazyListState.LZCons

object OtherPractice:
  lazy val codes: MyLazyList[String] =
    cons( "0",
      cons("1",
        codes.flatMap(
          s => cons("0" + s, cons("1" + s, empty))
        )
      )
    )

  lazy val palCodes: MyLazyList[String] =
    codes.filter(s => s == s.reverse)

  val middle: MyLazyList[String] = cons("", cons("0", cons("1", empty)))
  lazy val palCodes2: MyLazyList[String] = codes.flatMap(c => middle.map(m => c + m + c.reverse))
  // need to add base cases at the beginning
    /*cons("0", cons("1", empty))
      .append(
        codes.flatMap(c => middle.map(m => c + m + c.reverse))
      )*/

  def nextLine(currentLine: List[Int]): List[Int] =
    currentLine.foldLeft(List(1))(
      (acc, i) =>


  lazy val funSeq: MyLazyList[List[Int]] = ???



add $t0, $zero, $zero
add $v0, $zero, $zero
add $v1, $zero, $zero
Loop:
  sltu $t2, $t0, $a1
beq $t2, $zero, fin
lw $t1, 0($a0)
sltu $t2, $t1, $v0
bne $t2, $zero, skip
add $v0, $t1, $zero
add $v1, $t0, $zero
Skip:
  addi $t0, $t0, 1
addi $a0, $a0, 4
j loop
  fin:


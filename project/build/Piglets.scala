import sbt._

class PigletsProject(info: ProjectInfo) extends DefaultProject(info) {
    lazy val scalatest = "org.scalatest" % "scalatest" % "1.0" % "test"
}

ThisBuild / scalaVersion := "3.3.8"

lazy val root = project
  .in(file("."))
  .settings(
    name := "01-fibonacci",
    Compile / mainClass := Some("Fibonacci")
  )

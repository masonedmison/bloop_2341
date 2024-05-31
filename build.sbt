resolvers += "scala-integration" at "https://scala-ci.typesafe.com/artifactory/scala-integration/"
ThisBuild / scalaVersion := "2.13.14"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

scalacOptions ++= Seq(
  "-Xfatal-warnings"
)
javacOptions ++= Seq(
  "-Xlint:unchecked"
)
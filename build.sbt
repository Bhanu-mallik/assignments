ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "assignments"
  )

lazy val bt = (project in file("binaryTree"))
  .settings(
    name := "Binary tree",
  )

lazy val bti = (project in file("binaryTreeImplementation"))
  .settings(
    name := "Implementation",
  ).dependsOn(bt)

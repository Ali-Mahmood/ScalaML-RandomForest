name := "ScalaML"

version := "0.1"

scalaVersion := "2.11.12"

mainClass in (Compile,run) := Some("Main")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.11",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.11",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.0.11",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.11",
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.3.2",
  "org.apache.hadoop" % "hadoop-client" % "2.7.2",
  "org.apache.spark" %% "spark-sql" % "2.2.1",
  "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.6",
  "org.apache.spark" %% "spark-mllib" % "2.1.2"
)
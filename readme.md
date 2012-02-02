# scalariform hands-on

at Akasaka.scala 

http://akskscala.github.com/

## sbtscalariform

https://github.com/typesafehub/sbtscalariform

## sbteclipse

https://github.com/typesafehub/sbteclipse

## Getting Started

### only Eclipse Users

- sbt eclipse

Just execute the following:

```
sbt eclipse
```

- Enabled auto-refresh

Check `Preferences > General > Workspace > Refresh Automatically`.

### Run formatter

```
sbt clean
sbt compile
```

And then you will see:

```
[info] Formatting 1 Scala source {file:/home/workspace/scalariform-hands-on/}default-471fff(compile) ...
[info] Updating {file:/home/workspace/scalariform-hands-on/}default-471fff...
[info] Resolving org.scala-lang#scala-library;2.9.1 ...
[info] Done updating.
[info] Compiling 1 Scala source to /home/workspace/scalariform-hands-on\target\scala-2.9.1\classes...
[success] Total time: 9 s, completed 2012/02/02 18:58:22
```


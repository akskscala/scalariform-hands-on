package akskscala.no30

class Member(name: String, age: Int) {

  def selfIntroduction(): String = {
    "Nice to meet you! My name is " + name + ". I am " + age + " years old."
  }

}
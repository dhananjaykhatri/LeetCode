class Solution {
  public String simplifyPath(String path) {
    var stack = new Stack<String>();

    for (var s : path.split("/")) {
      if (s.equals("..")) {
        if (!stack.empty())
          stack.pop();
      } else if (!s.equals(".") && !s.equals("")) {
        stack.push(s);
      }
    }
    return "/" + String.join("/", stack);
  }
}
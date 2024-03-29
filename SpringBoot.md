# Procedure Call

1. the `pom.xml` as below:

```xml
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
  <dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.4.2</version>
  </dependency>
  <dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>mssql-jdbc</artifactId>
    <version>9.4.1.jre11</version>
  </dependency>
</dependencies>
```

2. the entity class:

```java
public class User {
  private String username;
  private String password;
  private Integer id;

  // getters and setters
}
```

3. mapper

```java
@Mapper
public interface UserMapper extends BaseMapper<User> {
  @Options(statementType = StatementType.CALLABLE)
  @Insert("{call p_sys_user_i(#{username, mode=IN}, #{password, mode=IN}, #{id, mode=OUT, jdbcType=INTEGER})}")
  void addUser(User user);
}
```

4. controller

```java
@RestController
@RequestMapping("/api")
public class UserController {
  @Autowired
  private UserMapper userMapper;

  @PostMapping("/user")
  public User addUser(@RequestBody User user) {
    userMapper.addUser(user);
    return user;
  }
}
```

5. front-end implementation

```html
<head>
  <meta charset="UTF-8">
  <title>User Form</title>
  <link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/layui/2.5.6/css/layui.min.css">
  <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://cdn.bootcdn.net/ajax/libs/layui/2.5.6/layui.min.js"></script>
</head>

<body>
  <div class="layui-container">
    <form id="user-form" class="layui-form layui-form-pane" action="">
      <div class="layui-form-item">
        <label class="layui-form-label">Username</label>
        <div class="layui-input-block">
          <input type="text" name="username" lay-verify="required" autocomplete="off" placeholder="Enter username"
            class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">Password</label>
        <div class="layui-input-block">
          <input type="password" name="password" lay-verify="required" autocomplete="off" placeholder="Enter password"
            class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <div class="layui-input-block">
          <button class="layui-btn" lay-submit lay-filter="submit-form">Submit</button>
        </div>
      </div>
    </form>
  </div>
</body>

<script>
  $(document).ready(function () {
    // initialize the form validation and submission
    layui.use('form', function () {
      var form = layui.form;
      form.on('submit(submit-form)', function (data) {
        $.ajax({
          type: "POST",
          url: "/api/user",
          data: JSON.stringify(data.field),
          contentType: "application/json; charset=utf-8",
          dataType: "json",
          success: function (response) {
            // display a success message
            layui.layer.msg("User added successfully");
            // clear the form
            $("#user-form")[0].reset();
          },
          error: function (xhr, status, error) {
            // display an error message
            layui.layer.msg("Error adding user: " + error);
          }
        });
        return false;
      });
    });
  });
</script>
```

6. json decode

```js
// assume the server returns a JSON string like this:
var jsonString = '{"name": "John", "age": 30, "city": "New York"}';

// decode the JSON data using JSON.parse()
var data = JSON.parse(jsonString);

// access the properties of the JavaScript object
console.log(data.name);  // outputs "John"
console.log(data.age);   // outputs 30
console.log(data.city);  // outputs "New York"
```

```js
try {
  var data = JSON.parse(jsonString);
} catch (e) {
  console.error("Invalid JSON data: " + e.message);
}
```

```js
// assume the server returns a JSON string with Chinese characters like this:
var jsonString = '{"name": "%E5%BC%A0%E4%B8%89", "age": 30, "city": "%E5%8C%97%E4%BA%AC"}';

// decode the JSON string using decodeURIComponent()
var decodedString = decodeURIComponent(jsonString);

// parse the decoded JSON string into a JavaScript object using JSON.parse()
var data = JSON.parse(decodedString);

// access the properties of the JavaScript object
console.log(data.name);  // outputs "张三"
console.log(data.age);   // outputs 30
console.log(data.city);  // outputs "北京"
```

```js
try {
  var decodedString = decodeURIComponent(jsonString);
} catch (e) {
  console.error("Invalid URL-encoded data: " + e.message);
}
```
<!DOCTYPE html>

<html>
    <head>
        <title>Spring Security Example </title>
    </head>
    <body>
        <div>
            Invalid username and password.
        </div>
        <div>
            You have been logged out.
        </div>
        <form action="/login"} method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <div><input type="submit" value="Sign In"/></div>
        </form>
    </body>
</html>
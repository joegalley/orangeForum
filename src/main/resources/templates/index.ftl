<#include "base.ftl">

<#macro page_head>
  <@common_page_head/>
  <title>Index</title>
</#macro>

<#macro page_body>

  <div class="container">
    <div style="background-color: orange;">
      orangeForum
      <div id="login-form">
        <form action="/login"} method="post">
          <div><label> User Name: <input type="text" name="username"/> </label></div>
          <div><label> Password: <input type="password" name="password"/> </label></div>
          <div><input type="submit" value="Sign In"/></div>
        </form>
      </div>
    </div>

    <table class="table table-bordered">
      <thead class="thead-dark">
        <tr>
          <th>Forum</th>
          <th>Threads</th>
          <th>Posts</th>
          <th>Last Post</th>
        </tr>
      </thead>
      <tbody>

      <#list subforums?keys as category>
        <tr class="thead-light">
          <th colspan="4">${category}</th>
        </tr>
        <#list subforums[category] as subforum>
          <tr>
            <th>${subforum.title}</th>
            <th>${subforum.category.name}</th>
            <th>${subforum.threadCount}</th>
            <th>${subforum.totalReplyCount}</th>
          </tr>
        </#list>
      </#list>
      </tbody>
    </table>
  </div>

</#macro>

<@display_page/>
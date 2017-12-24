<#include "base.ftl">

<#macro page_head>
  <@common_page_head/>
  <title>Index</title>
</#macro>

<#macro page_body>
  <table class="table">
    <thead class="thead-default">
      <tr>
        <th>Subforum</th>
        <th>Threads</th>
        <th>Posts</th>
        <th>Last Reply</th>
      </tr>
    </thead>
    <tbody>
      <#list subforums as subforum>
        <tr>
          <th>${subforum.title}</th>
          <th>${subforum.threadCount}</th>
          <th>${subforum.postCount}</th>
          <th>${subforum.lastReply}</th>
        </tr>
      </#list>
    </tbody>
  </table>
</#macro>

<@display_page/>
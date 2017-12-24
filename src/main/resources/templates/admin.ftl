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
      <#list detailedSubforums as detailedSubforum>
        <tr>
          <th>${detailedSubforum.title}</th>
          <th>${detailedSubforum.category.name}</th>
          <th>${detailedSubforum.threadCount}</th>
          <th>${detailedSubforum.totalViewCount}</th>
          <th>${detailedSubforum.totalReplyCount}</th>
        </tr>
      </#list>
    </tbody>
  </table>
</#macro>

<@display_page/>
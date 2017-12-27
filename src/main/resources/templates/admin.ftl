<#include "base.ftl">

<#macro page_head>
  <@common_page_head/>
  <title>Index</title>
</#macro>

<#macro page_body>
${tab}
  <ul class="nav nav-tabs">
    <li class="nav-item">
      <a class="nav-link <#if tab == "stats">active</#if>" href="/admin?tab=stats">Forum Stats</a>
    </li>
    <li class="nav-item">
      <a class="nav-link <#if tab == "subCat">active</#if>" href="/admin?tab=subCat">Subforums & Categories</a>
    </li>
    <li class="nav-item">
      <a class="nav-link <#if tab == "users">active</#if>" href="/admin?tab=users">User Management</a>
    </li>
    <li class="nav-item">
      <a class="nav-link <#if tab == "stats">custom</#if>" href="/admin?tab=customization">Customization</a>
    </li>
  </ul>
</#macro>

<@display_page/>
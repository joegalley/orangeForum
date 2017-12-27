<#include "base.ftl">

<#macro page_head>
  <@common_page_head/>
  <title>Index</title>

  <#if tab == "subCat">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
  </#if>
</#macro>

<#macro page_body>
  <ul class="nav nav-tabs">
    <li class="nav-item">
      <a class="nav-link <#if tab == "stats">active</#if>" href="/admin?tab=stats">Forum Stats</a>
    </li>
    <li class="nav-item">
      <a class="nav-link <#if tab == "subCat">active</#if>" href="/admin?tab=subCat">Subforums & Categories</a>
      <div id="jstree_demo_div"></div>
    </li>
    <li class="nav-item">
      <a class="nav-link <#if tab == "users">active</#if>" href="/admin?tab=users">User Management</a>
    </li>
    <li class="nav-item">
      <a class="nav-link <#if tab == "stats">customization</#if>" href="/admin?tab=customization">Customization</a>
    </li>
  </ul>
  <div class="tab-content clearfix">
    <div class="tab-pane active">
      <#switch tag>
        <#case "stats">
           Stats
           <#break>
        <#case "subCat">
           SubCat
           <#break>
        <#case "users">
           Users
           <#break>
        <#case "customization">
           Customization
           <#break>
      </#switch>
    </div>
  </div>

  <#if tab == "subCat">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>

  <script type="text/javascript">
    $(function () {
      $('#jstree_demo_div').jstree();
  });

  $('#jstree_demo_div').on("changed.jstree", function (e, data) {
    console.log(data.selected);
  });
  </script>
  </#if>

</#macro>

<@display_page/>
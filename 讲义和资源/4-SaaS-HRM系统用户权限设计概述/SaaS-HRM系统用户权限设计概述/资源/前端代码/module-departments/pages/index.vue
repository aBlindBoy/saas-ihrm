<template>
  <div class="dashboard-container">
    <div class="app-container">
      <el-card shadow="never">
            <div class='organization-index'>
              <div class='organization-index-top'>
                <div class='main-top-title'>
                  <el-tabs v-model="activeName">
                    <el-tab-pane label="组织结构" name="first"></el-tab-pane>
                    <div class="el-tabs-report">
                      <a class="el-button el-button--primary el-button--mini" title="导出" >导入</a>
                      <a class="el-button el-button--primary el-button--mini" title="导出" >导出</a>
                    </div>
                  </el-tabs>
                </div>
              </div>
              <div style="overflow: scroll;white-space:nowrap"  class="treBox">
                <div class="treeCon clearfix">
                    <span>
                      <i class="fa fa-university" aria-hidden="true"></i>
                      <span ><strong>企业名称</strong></span>
                    </span>
                    <div class="fr">
                      <span class="treeRinfo">
                        <div class="treeRinfo">
                          <span>负责人</span>
                          <span>在职  <em class="colGreen" title="在职人数">---</em>&nbsp;&nbsp;(<em class="colGreen" title="正式员工">---</em>&nbsp;/&nbsp;<em class="colRed" title="非正式员工">---</em>)</span>
                        </div>
                        <div class="treeRinfo">
                          <el-dropdown class="item">
                            <span class="el-dropdown-link">
                              操作<i class="el-icon-arrow-down el-icon--right"></i>
                            </span>
                            <el-dropdown-menu slot="dropdown">
                                <el-dropdown-item>
                                  <el-button type="text" @click="handlAdd('')">添加子部门</el-button>
                                </el-dropdown-item>
                              <el-dropdown-item>
                                <el-button type="text" @click="handleList()">查看待分配员工</el-button>
                              </el-dropdown-item>
                            </el-dropdown-menu>
                          </el-dropdown>
                        </div>
                      </span>  
                    </div>
                  </div>

                  <!-- 
                    构造树形列表
                      叶子 <i class="fa fa-male"></i>
                      非叶子 
                        展开 <i class="fa fa-minus-square-o">
                        闭合 <i class="fa fa-plus-square-o">
                    <div class="generalClass" slot-scope="{node,data}" style="width:99%">
                  -->

              </div>
            </div>    
      </el-card>
    </div>
</div>
</template>
 
<!-- 引入组件 -->
<script>
import commonApi from '@/utils/common'
export default {
  data() {
    return {
      activeName: 'first', 
      departData:{},
      depts:[]
    }
  },
  methods: {
  },
  created: function() {
  },
}
</script>
<style rel="stylesheet/scss" lang="scss">
.el-dropdown {
  color: #000000
}
.el-tree-node__content>.el-tree-node__expand-icon {
  padding:0px;
}
.el-tree-node__expand-icon {
  color:#ffffff
}
.generalClassNode {
  padding-left: 20px;
}
.el-tree-node__content{
  font-size: 16px;
  line-height: 36px;
  height:36px;
}
.custom-tree-node{
  padding-left: 20px;
}
.objectTree {
  overflow: auto;
  z-index: 100;
  width: 300px;
  border: 1px solid #dcdfe6;
  margin-top: 5px;
  left: 70px;
}
.el-tabs__content {
  overflow: initial;
}
.boxpad {
  margin-left: -40px;
}
</style>
<style  rel="stylesheet/scss" lang="scss" scoped>
.el-tree-node__expand-icon{
 
}
.el-icon-caret-right{}
.el-tree-node__content{
  font-size: 14px;
  line-height: 36px;
}
.generalClass {
  font-size: 14px;
  line-height: 36px;
  color:#000000
}
.all {
  position: relative;
  min-height: 100%;
  padding-bottom: 200px;
}
.organization-main:after,
.organization-index-top:after {
  display: block;
  clear: both;
  content: '';
  visibility: hidden;
  height: 0;
}
.organization-main {
  font-size: 14px;
  font-size: 14px;
}

.organization-index {
  padding-bottom: 20px;
  margin-left: 20px;
}
.main-top-title {
  padding-left: 20px;
  padding-top: 20px;
  text-align: left;
}

::-webkit-scrollbar-thumb {
  background-color: #018ee8;
  height: 50px;
  outline-offset: -2px;
  outline: 8px solid #fff;
  -webkit-border-radius: 4px;
}
::-webkit-scrollbar-track-piece {
  background-color: #fff;
  -webkit-border-radius: 0;
}
::-webkit-scrollbar {
  width: 8px;
  height: 8px;
}
::-webkit-scrollbar-thumb:hover {
  background-color: #fb4446;
  height: 50px;
  -webkit-border-radius: 4px;
}
.modal-total {
  width: 100%;
  height: 100%;
  position: fixed;
  top: 0;
  left: 0;
  background: #000;
  z-index: 90;
  opacity: 0.2;
}
.modal {
  width: 400px;
  height: 300px;
  background-color: #ffffff;
  z-index: 999;
  position: absolute;
  left: 45%;
  top: 20%;
  text-align: center;
}
.treBox {
  padding: 30px 120px 0;
}
.organization-index-top {
  position: relative;

  .el-tabs-report {
    position: absolute;
    top: -50px;
    right: 15px;
  }
}
.treeCon {
  border-bottom: 1px solid #cfcfcf;
  padding: 10px 0;
  margin-bottom: 10px;
  .el-dropdown {
    color: #333;
  }
}
.treeRinfo {
  display: inline-block;
}
.treeRinfo span {
  padding-left: 30px;
}
</style>

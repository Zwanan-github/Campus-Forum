<template>
  <div style=" margin-left: 50px">
    <h4>个人信息设置</h4>
    <el-form
        label-position="top"
        label-width="100px"
        :model="infoForm"
        style="max-width: 460px;"
    >
      <el-form-item label="用户名">
        <el-input v-model="infoForm.username"/>
      </el-form-item>
      <el-form-item label="描述">
        <el-input type="textarea" rows="4" placeholder="说说你自己吧" v-model="infoForm.desc"/>
      </el-form-item>
      <el-form-item label="性别">
        <el-radio-group v-model="infoForm.sex">
          <el-radio label="男" size="large">男</el-radio>
          <el-radio label="女" size="large">女</el-radio>
        </el-radio-group>
      </el-form-item>
      <el-form-item label="手机号">
        <el-input v-model="infoForm.phone"/>
      </el-form-item>
      <el-form-item label="QQ">
        <el-input v-model="infoForm.qq"/>
      </el-form-item>
      <el-form-item label="博客">
        <el-input v-model="infoForm.blog"/>
      </el-form-item>
    </el-form>
    <el-button type="success" :icon="Select">保存个人信息</el-button>
  </div>
</template>

<script setup>
import {reactive} from "vue";

import {Select} from "@element-plus/icons-vue"

const infoForm = reactive({
  username: '',
  desc: '',
  qq: '',
  blog: '',
  sex: '',
  phone: ''
});
</script>

<style scoped>

</style>
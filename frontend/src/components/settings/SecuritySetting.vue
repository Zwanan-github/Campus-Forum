<template>

  <div style=" margin-left: 50px">
    <h4>邮箱设置</h4>
    <el-form
        label-position="top"
        label-width="100px"
        :model="securityForm"
        style="max-width: 460px;"
    >
      <el-form-item label="邮箱">
        <el-input v-model="securityForm.email"/>
      </el-form-item>
    </el-form>
    <el-button type="success" :icon="Select">保存邮箱</el-button>
    <el-divider/>
    <h4>密码设置</h4>
    <el-form
        label-position="top"
        label-width="100px"
        :model="securityForm"
        style="max-width: 460px;"
    >
      <el-form-item label="原密码">
        <el-input v-model="securityForm.password_old"/>
      </el-form-item>
      <el-form-item label="新密码">
        <el-input v-model="securityForm.password_new"/>
      </el-form-item>
      <el-form-item label="重复密码">
        <el-input v-model="securityForm.password_repeat"/>
      </el-form-item>
    </el-form>
    <el-button type="success" :icon="Select">修改邮箱</el-button>
    <el-divider/>


  </div>

</template>

<script setup>

import {reactive} from "vue";
import {Select} from "@element-plus/icons-vue"

const securityForm = reactive({
  email: '',
  password_old: '',
  password_new: '',
  password_repeat: ''
})

</script>


<style scoped>

</style>
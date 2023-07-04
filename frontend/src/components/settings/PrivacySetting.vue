<template>
  <div style="margin-left: 50px">
    <h4>隐私信息设置</h4>
    <el-form
        label-position="top"
        label-width="100px"
        :model="privacyFrom"
        style="max-width: 460px;"
    >
      <el-form-item>
        <el-checkbox v-model="privacyFrom.email" label="是否展示邮箱" size="large"/>
      </el-form-item>
      <el-form-item>
        <el-checkbox v-model="privacyFrom.desc" label="是否展示描述" size="large"/>
      </el-form-item>
      <el-form-item>
        <el-checkbox v-model="privacyFrom.qq" label="是否展示qq" size="large"/>
      </el-form-item>
      <el-form-item>
        <el-checkbox v-model="privacyFrom.blog" label="是否展示博客" size="large"/>
      </el-form-item>
      <el-form-item>
        <el-checkbox v-model="privacyFrom.sex" label="是否展示性别" size="large"/>
      </el-form-item>
      <el-form-item>
        <el-checkbox v-model="privacyFrom.phone" label="是否展示手机号" size="large"/>
      </el-form-item>
    </el-form>
    <el-button type="success" :icon="Select">保存隐私设置</el-button>
  </div>


</template>

<script setup>

import {reactive} from "vue";
import {Select} from "@element-plus/icons-vue"

const privacyFrom = reactive({
  email: false,
  desc: false,
  qq: false,
  blog: false,
  sex: false,
  phone: false
})


</script>

<style scoped>
::v-deep(.el-form-item) {
  margin-bottom: 5px;
}
</style>
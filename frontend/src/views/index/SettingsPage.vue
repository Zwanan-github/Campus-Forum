<template>
  <div class="setting-container">
    <div class="setting-tab-container">
      <el-tabs v-model="activeName">
        <el-tab-pane label="个人信息设置" name="self-info">
          <InfoSetting/>
        </el-tab-pane>
        <el-tab-pane label="账号安全设置" name="self-security">
          <SecuritySetting/>
        </el-tab-pane>
        <el-tab-pane label="隐私信息设置" name="self-privacy">
          <PrivacySetting/>
        </el-tab-pane>
      </el-tabs>
    </div>
    <div style="width: 300px">
      <div class="user-card">
        <div
            style="display: flex;text-align: left; padding: 5px; background-color: aliceblue;height: 50px;border-bottom: lightgray 1px solid">
          <el-avatar class="avatar"
                     :size="50"
                     src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"
                     style="margin-left: 5px">
          </el-avatar>
          <div style="margin: 18px 0 0 5px">
            {{ store.auth.user.username }}
          </div>

        </div>

      </div>
    </div>
  </div>
</template>

<script setup>
import {ref} from "vue";
import {useStore} from "@/stores/counter";
import InfoSetting from "@/components/settings/InfoSetting.vue";
import SecuritySetting from "@/components/settings/SecuritySetting.vue";
import PrivacySetting from "@/components/settings/PrivacySetting.vue";

const activeName = ref("self-info");
const store = useStore();




</script>

<style scoped>
.setting-container {
  display: flex;
  padding: 10px;
}

.setting-tab-container {
  flex: 1;
}

.user-card {
  margin-left: 30px;
  height: 300px;
  width: 250px;
  border-radius: 5px;
  margin-top: 20px;
  border: lightgray 2px solid;
}


</style>
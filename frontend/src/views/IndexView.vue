<template>
  <div class="common-layout">
    <el-container class="page-container">
      <el-aside class="page-aside">
        <div style="text-align: center;margin:10px 0 10px 0">
          <el-image src="https://element-plus.gitee.io/images/element-plus-logo.svg"
                    style="width: 160px;"
          />
        </div>
        <el-menu
            router
            :default-active="router.currentRoute.value.path"
            class="el-menu-vertical-demo"
            @open="handleOpen"
            @close="handleClose"
        >
          <el-menu-item index="/index">
            <el-icon>
              <icon-menu/>
            </el-icon>
            <span>帖子列表</span>
          </el-menu-item>
          <el-menu-item index="2">
            <el-icon>
              <document/>
            </el-icon>
            <span>表白墙</span>
          </el-menu-item>
          <el-menu-item index="3">
            <el-icon>
              <Notebook/>
            </el-icon>
            <span>我的帖子</span>
          </el-menu-item>
          <el-menu-item index="4">
            <el-icon>
              <StarFilled/>
            </el-icon>
            <span>我的收藏</span>
          </el-menu-item>
          <el-menu-item index="/index/setting">
            <el-icon>
              <setting/>
            </el-icon>
            <span>个人设置</span>
          </el-menu-item>
        </el-menu>
      </el-aside>
      <el-container>
        <el-header class="page-header">
          <div style="display: flex; padding: 5px 0">
            <div style="flex: 1">
              <el-input
                  style="width: 320px; padding-top: 10px"
                  class="w-50 m-2"
                  placeholder="Please Input"
                  :prefix-icon="Search"
              />
            </div>
            <!-- ICON -->
            <div style="display: flex;">
              <div style="margin: 8px 8px 0 0; text-align: right; font-size: small">
                <div>{{ store.auth.user?.username }}</div>
                <div style="color: gray">{{ store.auth.user?.email }}</div>
              </div>
              <el-dropdown trigger="click">
                <el-avatar class="avatar"
                           :size="50"
                           src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"></el-avatar>
                <template #dropdown>
                  <el-dropdown-menu>
                    <el-dropdown-item>
                      <el-icon>
                        <User/>
                      </el-icon>
                      个人设置
                    </el-dropdown-item>
                    <el-dropdown-item>
                      <el-icon>
                        <ChatDotSquare/>
                      </el-icon>
                      消息
                    </el-dropdown-item>
                    <el-dropdown-item divided @click="logout()" style="color: red;">
                      <el-icon>
                        <SwitchButton/>
                      </el-icon>
                      退出登录
                    </el-dropdown-item>
                  </el-dropdown-menu>
                </template>
              </el-dropdown>
            </div>
          </div>
        </el-header>
        <el-main style="padding: 0 0 0 0">
          <router-view/>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script setup>
import {get} from "@/js";
import {ElMessage} from "element-plus";
import router from "@/router";
import {useStore} from "@/stores/counter";
import {
  Document,
  Location,
  Setting,
  Menu as IconMenu,
  Search,
  ChatDotSquare,
  User,
  SwitchButton,
  Notebook,
  StarFilled
} from "@element-plus/icons-vue";
import {ref} from "vue";

const store = useStore();


const logout = () => {
  get("/api/auth/logout", (message) => {
    ElMessage.success(message);
    store.auth.user = null;
    localStorage.removeItem("user")
    router.push('/');
  })
}
</script>

<style scoped>

.common-layout {
  height: 100vh;
}

.page-container {
  height: 100vh;
}

.page-aside {
  border-right: lightgray 1px solid;
  width: 200px;
}

.page-header {
  border-bottom: lightgray 1px solid;
  height: 60px;
}

.avatar:hover {
  cursor: pointer;
}

</style>
<template>
	<view class="content">
		<view class="box" :style='{"minHeight":"100%","width":"100%","padding":"60rpx 60rpx 0","background":"url(http://codegen.caihongy.cn/20250122/550797dfb6784a578ec2c443ed3ade77.png) no-repeat center center/ 100% 100%","height":"auto"}'>
			<view :style='{"padding":"0 40rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}'>
				<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20241223/4c5ca564bcb04406966d505869364648.png" mode="aspectFill"></image>
				<view v-if="loginType==1" :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' class="uni-form-item uni-column">
					<view :style='{"padding":"0 0 0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">账号：</view>
					<input v-model="username" :style='{"border":"none","padding":"0px 20rpx","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' type="text" class="uni-input" name="" placeholder="请输入账号" />
				</view>
				<view v-if="loginType==1" :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' class="uni-form-item uni-column">
					<view :style='{"padding":"0 0 0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">密码：</view>
					<input v-model="password" password :style='{"border":"none","padding":"0px 20rpx","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' type="password" class="uni-input" name="" placeholder="请输入密码" />
				</view>
				<view v-if="roleNum>1" :style='{"padding":"0 0 8rpx 0","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 20rpx 0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}'>
					<view :style='{"padding":"0 0 0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">用户类型：</view>
					<picker @change="optionsChange" :value="index" :range="options" :style='{"border":"none","padding":"0 10rpx","margin":"0px","whiteSpace":"nowrap","color":"#6971A3","borderRadius":"0","background":"none","width":"auto","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'>
						<view class="uni-picker-type">{{options[index]}}</view>
					</picker>
				</view>
				

				
				<button v-if="loginType==1" class="btn-submit" @tap="onLoginTap" type="primary" :style='{"border":"0","padding":"0px","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"0","background":"#007FCA","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx","order":"2"}'>登陆</button>
				<button v-if="loginType==2" class="btn-submit" @tap="onFaceLoginTap" type="primary" :style='{"border":"0","padding":"0px","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"0","background":"#007FCA","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx","order":"2"}'>人脸识别登录</button>
				<view class="links" :style='{"padding":"0 0 12rpx 0","margin":"10rpx 0 0","flexWrap":"wrap","display":"flex","width":"100%","height":"auto","order":"3"}'>
					<view class="link-highlight" @tap="onRegisterTap('yonghu')" :style='{"padding":"0 8rpx","margin":"0 10rpx","color":"#007FCA","background":"#DFEAFF","fontSize":"28rpx","lineHeight":"60rpx","height":"60rpx"}'>注册用户</view>
				</view>
				
				<view class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea1</view>
				<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
				<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
			</view>
		</view>
	</view>
</template>

<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				username: '',
				password: '',
                loginType:1,
				codes: [{
				  num: 1,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}, {
				  num: 2,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}, {
				  num: 3,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}, {
				  num: 4,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}],
				options: [
					'请选择登录用户类型',
				],
                optionsValues: [
					'',
                    'yonghu',
				],
				index: 0,
				roleNum:0,

			}
		},
		onLoad() {
			let options = ['请选择登录用户类型'];
			let menus = menu.list();
			this.menuList = menus;
			for(let i=0;i<this.menuList.length;i++){
				if(this.menuList[i].hasFrontLogin=='是'){
					options.push(this.menuList[i].roleName);
					this.roleNum++;
				}
			}
			if(this.roleNum==1) {
				this.index = 1;
			}	
			this.options = options;
			this.styleChange()
		},
		onShow() {
		},
		mounted() {
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.loginFrom.content.input.backgroundColor
					// })
				})
			},
			onRegisterTap(tableName) {
                uni.setStorageSync("loginTable", tableName);
				this.$utils.jump('../register/register')
			},
			async onLoginTap() {
                if (!this.username) {
					this.$utils.msg('请输入用户名')
					return
				}
                if (!this.password) {
					this.$utils.msg('请输入用户密码')
					return
				}
                if (!this.optionsValues[this.index]) {
					this.$utils.msg('请选择登录用户类型')
					return
				}

				this.loginPost()

			},
			async loginPost() {
				
				let res = await this.$api.login(`${this.optionsValues[this.index]}`, {
					username: this.username,
					password: this.password
				});
				uni.removeStorageSync("useridTag");
				uni.setStorageSync("appToken", res.token);
				uni.setStorageSync("nickname",this.username);
				uni.setStorageSync("nowTable", `${this.optionsValues[this.index]}`);
				res = await this.$api.session(`${this.optionsValues[this.index]}`);
				if(res.data.touxiang) {
				    uni.setStorageSync('headportrait', res.data.touxiang);
				} else if(res.data.headportrait) {
				    uni.setStorageSync('headportrait', res.data.headportrait);
				}
				uni.setStorageSync('userSession',JSON.stringify(res.data))
				// 保存用户id
				uni.setStorageSync("appUserid", res.data.id);
				if(res.data.vip) {
					uni.setStorageSync("vip", res.data.vip);
				}
				uni.setStorageSync("appRole", `${this.options[this.index]}`);
				this.$utils.tab('../index/index');
			},
			optionsChange(e) {
				this.index = e.target.value
			}
		}
	}
</script>

<style lang="scss" scoped>
	page {
		height: 100%;
	}
	
	.content {
		height: 100%;
		box-sizing: border-box;
	}
	
</style>

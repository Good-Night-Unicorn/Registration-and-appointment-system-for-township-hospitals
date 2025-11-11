<template>
<view class="content">
	<view :style='{"minHeight":"100%","width":"100%","padding":"60rpx 60rpx 0","background":"#FEF9F3","height":"auto"}'>
		<form :style='{"padding":"0 40rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="app-update-pv">
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">医生账号</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.yishengzhanghao" v-model="ruleForm.yishengzhanghao" placeholder="医生账号"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">密码</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" placeholder="密码"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="" @tap="touxiangTap">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">头像</view>
				<image :style='{"width":"80rpx","margin":"0 0 0 160rpx","borderRadius":"100%","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.touxiang" :src="baseUrl+ruleForm.touxiang.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","margin":"0 0 0 160rpx","borderRadius":"100%","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">医生姓名</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.yishengxingming" v-model="ruleForm.yishengxingming" placeholder="医生姓名"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class=" select">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">性别</view>
				<picker :disabled="ro.xingbie" :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' @change="xingbieChange" :value="xingbieIndex" :range="xingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#27357C"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">手机号码</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.shoujihaoma" v-model="ruleForm.shoujihaoma" placeholder="手机号码"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">职称</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.zhicheng" v-model="ruleForm.zhicheng" placeholder="职称"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class=" select">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">科室</view>
				<picker :disabled="ro.keshi" :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' @change="keshiChange" :value="keshiIndex" :range="keshiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#27357C"}' class="uni-input">{{ruleForm.keshi?ruleForm.keshi:"请选择科室"}}</view>
				</picker>
			</view>
        
			
			<view :style='{"padding":"0 110rpx","flexDirection":"column","display":"flex","gap":"20rpx","width":"100%","justifyContent":"center","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"0","background":"#007FCA","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
	import xiaEditor from '@/components/xia-editor/xia-editor';
	import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				yishengzhanghao: '',
				mima: '',
				touxiang: '',
				yishengxingming: '',
				xingbie: '',
				shoujihaoma: '',
				zhicheng: '',
				keshi: '',
				},
				xingbieOptions: [],
				xingbieIndex: 0,
				keshiOptions: [],
				keshiIndex: 0,
				// 登录用户信息
				user: {},
				ro:{
				   yishengzhanghao : false,
				   mima : false,
				   touxiang : false,
				   yishengxingming : false,
				   xingbie : false,
				   shoujihaoma : false,
				   zhicheng : false,
				   keshi : false,
				},
				virtualPay: false,
			}
		},
		components: {
			wPicker,
			xiaEditor,
			multipleSelect,
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			if(options.virtualPay){
				this.virtualPay = true
			}
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取

			this.ro.zhicheng = true;
			this.ro.keshi = true;

			// 自定义下拉框值
			this.xingbieOptions = "男,女".split(',')
			// 下拉框
			res = await this.$api.option(`keshi`,`keshi`,{});
			this.keshiOptions = res.data;
			this.keshiOptions.unshift("请选择科室");

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("appUserid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = Number(options.refid);
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`yisheng`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yishengzhanghao'){
						this.ruleForm.yishengzhanghao = obj[o];
						this.ro.yishengzhanghao = true;
						continue;
					}
					if(o=='mima'){
						this.ruleForm.mima = obj[o];
						this.ro.mima = true;
						continue;
					}
					if(o=='touxiang'){
						this.ruleForm.touxiang = obj[o].split(",")[0];
						this.ro.touxiang = true;
						continue;
					}
					if(o=='yishengxingming'){
						this.ruleForm.yishengxingming = obj[o];
						this.ro.yishengxingming = true;
						continue;
					}
					if(o=='xingbie'){
						this.ruleForm.xingbie = obj[o];
						this.ro.xingbie = true;
						continue;
					}
					if(o=='shoujihaoma'){
						this.ruleForm.shoujihaoma = obj[o];
						this.ro.shoujihaoma = true;
						continue;
					}
					if(o=='zhicheng'){
						this.ruleForm.zhicheng = obj[o];
						this.ro.zhicheng = true;
						continue;
					}
					if(o=='keshi'){
						this.ruleForm.keshi = obj[o];
						this.ro.keshi = true;
						continue;
					}
				}
			}
			this.styleChange()
			this.$forceUpdate()
			if (uni.getStorageSync('raffleType') && uni.getStorageSync('raffleType') != null) {
				uni.removeStorageSync('raffleType')
				setTimeout(() => {
					this.onSubmitTap()
				}, 300)
			}
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数



			// 下拉变化
			xingbieChange(e) {
				this.xingbieIndex = e.target.value
				this.ruleForm.xingbie = this.xingbieOptions[this.xingbieIndex]
			},
			// 下拉变化
			keshiChange(e) {
				this.keshiIndex = e.target.value
				this.ruleForm.keshi = this.keshiOptions[this.keshiIndex]
			},

			touxiangTap() {
				let _this = this;
				if(this.ro.touxiang){
					return false
				}
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				let that = this
				//跨表计算判断
				var obj;
				if((!this.ruleForm.yishengzhanghao)){
					this.$utils.msg(`医生账号不能为空`);
					return
				}
				if((!this.ruleForm.mima)){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.yishengxingming)){
					this.$utils.msg(`医生姓名不能为空`);
					return
				}
				if(this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				//更新跨表属性
				var crossuserid;
				var crossrefid;
				var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						if(!obj) {
							obj = uni.getStorageSync('crossObj');
						}
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
							   crossuserid=Number(uni.getStorageSync('appUserid'));
							   crossrefid=obj['id'];
							   crossoptnum=uni.getStorageSync('statusColumnName');
							   crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`yisheng`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						uni.removeStorageSync('crossCleanType');
						return false;
					} else {
				//跨表计算
						let oet = {}
						if(this.ruleForm.id){
							await this.$api.update(`yisheng`, this.ruleForm);
						}else{
							oet = await this.$api.add(`yisheng`, this.ruleForm);
						}
						if(this.cross){
							uni.setStorageSync('crossCleanType',true);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
				//跨表计算
					let oet = {}
					if(this.ruleForm.id){
						await this.$api.update(`yisheng`, this.ruleForm);
					}else{
						oet = await this.$api.add(`yisheng`, this.ruleForm);
					}
					if(this.cross){
						uni.setStorageSync('crossCleanType',true);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				if(this.ro[str]){
					return false
				}
				this.$refs[str].show();
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>

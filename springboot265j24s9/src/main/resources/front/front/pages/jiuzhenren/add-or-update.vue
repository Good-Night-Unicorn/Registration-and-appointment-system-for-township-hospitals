<template>
<view class="content">
	<view :style='{"minHeight":"100%","width":"100%","padding":"60rpx 60rpx 0","background":"#FEF9F3","height":"auto"}'>
		<form :style='{"padding":"0 40rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="app-update-pv">
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">姓名</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class=" select">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">性别</view>
				<picker :disabled="ro.xingbie" :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' @change="xingbieChange" :value="xingbieIndex" :range="xingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#27357C"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">身份证号</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.shenfenzhenghao" v-model="ruleForm.shenfenzhenghao" placeholder="身份证号"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">年龄</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.nianling" v-model.number="ruleForm.nianling" placeholder="年龄" type="number"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">手机</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.shouji" v-model="ruleForm.shouji" placeholder="手机"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">关系</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.guanxi" v-model="ruleForm.guanxi" placeholder="关系"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">备注</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.beizhu" v-model="ruleForm.beizhu" placeholder="备注"  type="text"></input>
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
				xingming: '',
				xingbie: '',
				shenfenzhenghao: '',
				nianling: '',
				shouji: '',
				guanxi: '',
				beizhu: '',
				userid: '',
				},
				xingbieOptions: [],
				xingbieIndex: 0,
				// 登录用户信息
				user: {},
				ro:{
				   xingming : false,
				   xingbie : false,
				   shenfenzhenghao : false,
				   nianling : false,
				   shouji : false,
				   guanxi : false,
				   beizhu : false,
				   userid : false,
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


			// 自定义下拉框值
			this.xingbieOptions = "男,女".split(',')

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
				res = await this.$api.info(`jiuzhenren`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='xingming'){
						this.ruleForm.xingming = obj[o];
						this.ro.xingming = true;
						continue;
					}
					if(o=='xingbie'){
						this.ruleForm.xingbie = obj[o];
						this.ro.xingbie = true;
						continue;
					}
					if(o=='shenfenzhenghao'){
						this.ruleForm.shenfenzhenghao = obj[o];
						this.ro.shenfenzhenghao = true;
						continue;
					}
					if(o=='nianling'){
						this.ruleForm.nianling = obj[o];
						this.ro.nianling = true;
						continue;
					}
					if(o=='shouji'){
						this.ruleForm.shouji = obj[o];
						this.ro.shouji = true;
						continue;
					}
					if(o=='guanxi'){
						this.ruleForm.guanxi = obj[o];
						this.ro.guanxi = true;
						continue;
					}
					if(o=='beizhu'){
						this.ruleForm.beizhu = obj[o];
						this.ro.beizhu = true;
						continue;
					}
					if(o=='userid'){
						this.ruleForm.userid = obj[o];
						this.ro.userid = true;
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


			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				let that = this
				//跨表计算判断
				var obj;
				if((!this.ruleForm.xingming)){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if((!this.ruleForm.xingbie)){
					this.$utils.msg(`性别不能为空`);
					return
				}
				if((!this.ruleForm.shenfenzhenghao)){
					this.$utils.msg(`身份证号不能为空`);
					return
				}
				if(this.ruleForm.shenfenzhenghao&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzhenghao))){
					this.$utils.msg(`身份证号应输入身份证格式`);
					return
				}
				if((!this.ruleForm.nianling)){
					this.$utils.msg(`年龄不能为空`);
					return
				}
				if(this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if((!this.ruleForm.shouji)){
					this.$utils.msg(`手机不能为空`);
					return
				}
				if(this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if((!this.ruleForm.guanxi)){
					this.$utils.msg(`关系不能为空`);
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
					let res = await this.$api.list(`jiuzhenren`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						uni.removeStorageSync('crossCleanType');
						return false;
					} else {
				//跨表计算
						let oet = {}
						if(this.ruleForm.id){
							await this.$api.update(`jiuzhenren`, this.ruleForm);
						}else{
							oet = await this.$api.add(`jiuzhenren`, this.ruleForm);
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
						await this.$api.update(`jiuzhenren`, this.ruleForm);
					}else{
						oet = await this.$api.add(`jiuzhenren`, this.ruleForm);
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

<template>
<view class="content">
	<view :style='{"minHeight":"100%","width":"100%","padding":"60rpx 60rpx 0","background":"#FEF9F3","height":"auto"}'>
		<form :style='{"padding":"0 40rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="app-update-pv">
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">病历编号</view>
				<view :style='{"padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","flex":"1","background":"#FFFFFF","lineHeight":"80rpx","fontSize":"28rpx"}' class="right-input">
					{{ruleForm.binglibianhao}}
				</view>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">医生姓名</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.yishengxingming" v-model="ruleForm.yishengxingming" placeholder="医生姓名"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="" @tap="touxiangTap">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">头像</view>
				<image :style='{"width":"80rpx","margin":"0 0 0 160rpx","borderRadius":"100%","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.touxiang" :src="baseUrl+ruleForm.touxiang.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","margin":"0 0 0 160rpx","borderRadius":"100%","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">科室</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.keshi" v-model="ruleForm.keshi" placeholder="科室"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class=" select">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">就诊人</view>
				<picker :disabled="ro.xingming" :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' @change="xingmingChange" :value="xingmingIndex" :range="xingmingOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#27357C"}' class="uni-input">{{xingmingOptions[xingmingIndex]}}</view>
				</picker>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">性别</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' disabled v-model="ruleForm.xingbie" placeholder="性别"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">登记时间</view>
				<input :disabled="ro.dengjishijian" :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' v-model="ruleForm.dengjishijian" placeholder="登记时间" @tap="toggleTab('dengjishijian')"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">用户账号</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">用户姓名</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"  type="text"></input>
			</view>
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">诊断结果</view>
				<input :style='{"border":"none","padding":"0px 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"#6971A3","borderRadius":"0","flex":"1","background":"#FFFFFF","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.zhenduanjieguo" v-model="ruleForm.zhenduanjieguo" placeholder="诊断结果"  type="text"></input>
			</view>
              
			<view :style='{"margin":"0 0 60rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' class="">
				<view :style='{"padding":"0 0 0 20rpx","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"140rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","fontWeight":"400","height":"80rpx"}' class="title">治疗方案</view>
				<textarea :style='{"border":"0","padding":"20rpx 24rpx 0 160rpx","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"#FFFFFF","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.zhiliaofangan" placeholder="治疗方案" :maxlength="-1"></textarea>
			</view>
			<view :style='{"width":"100%","padding":"12rpx 0","margin":"0 0 24rpx 0","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","fontWeight":"500"}' class="title">病历记录</view>
				<xia-editor ref="binglijilu" :style='{"minHeight":"300rpx","border":"2rpx solid #efefef","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","padding":"20rpx","background":"#FFFFFF","width":"100%","height":"auto"}' v-model="ruleForm.binglijilu" placeholder="病历记录" @editorChange="binglijiluChange"></xia-editor>
			</view>
			
			<view :style='{"padding":"0 110rpx","flexDirection":"column","display":"flex","gap":"20rpx","width":"100%","justifyContent":"center","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"0","background":"#007FCA","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker  mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="dengjishijianConfirm" ref="dengjishijian" themeColor="#333333"></w-picker>
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
				binglibianhao: this.getUUID(),
				yishengzhanghao: '',
				yishengxingming: '',
				touxiang: '',
				keshi: '',
				xingming: '',
				xingbie: '',
				dengjishijian: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				zhenduanjieguo: '',
				zhiliaofangan: '',
				binglijilu: '',
				userid: '',
				},
				xingmingOptions: [],
				xingmingIndex: 0,
				// 登录用户信息
				user: {},
				ro:{
				   binglibianhao : false,
				   yishengzhanghao : false,
				   yishengxingming : false,
				   touxiang : false,
				   keshi : false,
				   xingming : false,
				   xingbie : false,
				   dengjishijian : false,
				   yonghuzhanghao : false,
				   yonghuxingming : false,
				   zhenduanjieguo : false,
				   zhiliaofangan : false,
				   binglijilu : false,
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
			this.ruleForm.dengjishijian =  this.$utils.getCurDateTime();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;


			// 下2
			res = await this.$api.option(`jiuzhenren`,`xingming`,{});
			this.xingmingOptions = res.data;

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
				res = await this.$api.info(`binglixinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='binglibianhao'){
						this.ruleForm.binglibianhao = obj[o];
						this.ro.binglibianhao = true;
						continue;
					}
					if(o=='yishengzhanghao'){
						this.ruleForm.yishengzhanghao = obj[o];
						this.ro.yishengzhanghao = true;
						continue;
					}
					if(o=='yishengxingming'){
						this.ruleForm.yishengxingming = obj[o];
						this.ro.yishengxingming = true;
						continue;
					}
					if(o=='touxiang'){
						this.ruleForm.touxiang = obj[o].split(",")[0];
						this.ro.touxiang = true;
						continue;
					}
					if(o=='keshi'){
						this.ruleForm.keshi = obj[o];
						this.ro.keshi = true;
						continue;
					}
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
					if(o=='dengjishijian'){
						this.ruleForm.dengjishijian = obj[o];
						this.ro.dengjishijian = true;
						continue;
					}
					if(o=='yonghuzhanghao'){
						this.ruleForm.yonghuzhanghao = obj[o];
						this.ro.yonghuzhanghao = true;
						continue;
					}
					if(o=='yonghuxingming'){
						this.ruleForm.yonghuxingming = obj[o];
						this.ro.yonghuxingming = true;
						continue;
					}
					if(o=='zhenduanjieguo'){
						this.ruleForm.zhenduanjieguo = obj[o];
						this.ro.zhenduanjieguo = true;
						continue;
					}
					if(o=='zhiliaofangan'){
						this.ruleForm.zhiliaofangan = obj[o];
						this.ro.zhiliaofangan = true;
						continue;
					}
					if(o=='binglijilu'){
						this.ruleForm.binglijilu = obj[o];
						this.ro.binglijilu = true;
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
			binglijiluChange(e) {
				this.ruleForm.binglijilu = e
			},
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
			// 下二随
			async xingmingChange (e) {
				this.xingmingIndex = e.target.value
				this.ruleForm.xingming = this.xingmingOptions[this.xingmingIndex]
				let res = await this.$api.follow(`jiuzhenren`, `xingming`,{
					columnValue: this.ruleForm.xingming
				});
				if(res.data.xingbie){
					this.ruleForm.xingbie = res.data.xingbie
				}
			},

			// 多级联动参数


			// 日长控件选择日期时间
			dengjishijianConfirm(val) {
				console.log(val)
				this.ruleForm.dengjishijian = val.result;
				this.$forceUpdate();
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
				if(this.ruleForm.binglibianhao){
					this.ruleForm.binglibianhao = String(this.ruleForm.binglibianhao)
				}
				//跨表计算判断
				var obj;
				if((!this.ruleForm.xingming)){
					this.$utils.msg(`就诊人不能为空`);
					return
				}
				if((!this.ruleForm.zhenduanjieguo)){
					this.$utils.msg(`诊断结果不能为空`);
					return
				}
				if((!this.ruleForm.zhiliaofangan)){
					this.$utils.msg(`治疗方案不能为空`);
					return
				}
				if((!this.ruleForm.binglijilu)){
					this.$utils.msg(`病历记录不能为空`);
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
					let res = await this.$api.list(`binglixinxi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						uni.removeStorageSync('crossCleanType');
						return false;
					} else {
				//跨表计算
						let oet = {}
						if(this.ruleForm.id){
							await this.$api.update(`binglixinxi`, this.ruleForm);
						}else{
							oet = await this.$api.add(`binglixinxi`, this.ruleForm);
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
						await this.$api.update(`binglixinxi`, this.ruleForm);
					}else{
						oet = await this.$api.add(`binglixinxi`, this.ruleForm);
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

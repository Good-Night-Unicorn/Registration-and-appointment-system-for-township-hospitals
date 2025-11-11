<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100%","width":"100%","padding":"60rpx 60rpx 0","background":"url(http://codegen.caihongy.cn/20250122/550797dfb6784a578ec2c443ed3ade77.png) no-repeat center center/ 100% 100%","height":"auto"}'>
		<view :style='{"padding":"0 40rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20241223/d9d27c65673a41a0a80f6e74709c1c30.png" mode="aspectFill"></image>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">用户账号：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.yonghuzhanghao"  type="text"  class="uni-input" name="" placeholder="用户账号" />
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">密码：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">确认密码：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">用户姓名：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.yonghuxingming"  type="text"  class="uni-input" name="" placeholder="用户姓名" />
			</view>
            <view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">头像：</view>
				<image :style='{"width":"72rpx","margin":"8rpx 0","borderRadius":"100%","display":"block","height":"72rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"72rpx","margin":"8rpx 0","borderRadius":"100%","display":"block","height":"72rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
            <view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">性别：</view>
				<picker :style='{"padding":"0 0 8rpx 0","margin":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
					<view>
						<view :style='{"border":"none","padding":"0px 20rpx","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","background":"none","width":"100%","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">手机号码：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.shoujihaoma"  type="text"  class="uni-input" name="" placeholder="手机号码" />
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">医生账号：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.yishengzhanghao"  type="text"  class="uni-input" name="" placeholder="医生账号" />
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">密码：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">确认密码：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
            <view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" @tap="yishengtouxiangTap" class="">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">头像：</view>
				<image :style='{"width":"72rpx","margin":"8rpx 0","borderRadius":"100%","display":"block","height":"72rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"72rpx","margin":"8rpx 0","borderRadius":"100%","display":"block","height":"72rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">医生姓名：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.yishengxingming"  type="text"  class="uni-input" name="" placeholder="医生姓名" />
			</view>
            <view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">性别：</view>
				<picker :style='{"padding":"0 0 8rpx 0","margin":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'"  @change="yishengxingbieChange" :value="yishengxingbieIndex" :range="yishengxingbieOptions">
					<view>
						<view :style='{"border":"none","padding":"0px 20rpx","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","background":"none","width":"100%","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">手机号码：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.shoujihaoma"  type="text"  class="uni-input" name="" placeholder="手机号码" />
			</view>
			<view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">职称：</view>
				<input :style='{"border":"none","padding":"0","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","flex":"1","background":"none","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="true" v-model="ruleForm.zhicheng"  type="text"  class="uni-input" name="" placeholder="职称" />
			</view>
            <view :style='{"boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9,inset 0px 2rpx 8rpx 0px #9AAAC9","margin":"0 0 40rpx 0","borderColor":"#6971A3","borderRadius":"0","background":"#fff","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" class="">
				<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#000000","textAlign":"left","background":"none","flex":"none","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"400","height":"80rpx"}' class="label">科室：</view>
				<picker :style='{"padding":"0 0 8rpx 0","margin":"0","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" disabled="true" @change="yishengkeshiChange" :value="yishengkeshiIndex" :range="yishengkeshiOptions">
					<view>
						<view :style='{"border":"none","padding":"0px 20rpx","boxShadow":"none","margin":"0px","color":"#666","borderRadius":"0","background":"none","width":"100%","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' class="uni-input">{{ruleForm.keshi?ruleForm.keshi:"请选择科室"}}</view>
					</view>
				</picker>
			</view>
			<button :style='{"border":"0","padding":"0px","boxShadow":" 0px 8rpx 8rpx 0px #9AAAC9","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"0","background":"#007FCA","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx","order":"2"}' class="btn-submit" @tap="register" type="primary">注册</button>
			
			<view class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea1</view>
			<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
			<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
                yishengxingbieOptions: [],
                yishengxingbieIndex: 0,
                yishengkeshiOptions: [],
                yishengkeshiIndex: 0,
				ruleForm: {
                yonghuzhanghao: '',
                mima: '',
                yonghuxingming: '',
                touxiang: '',
                xingbie: '',
                shoujihaoma: '',
                yishengzhanghao: '',
                mima: '',
                touxiang: '',
                yishengxingming: '',
                xingbie: '',
                shoujihaoma: '',
                zhicheng: '',
                keshi: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='yisheng'){
                this.yishengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yishengxingbieOptions[0]
			}
			if(this.tableName=='yisheng'){
                res = await this.$api.option(`keshi`,`keshi`,{});
                this.yishengkeshiOptions = res.data;
                this.yishengkeshiOptions.unshift("请选择科室");
			}
			
			this.styleChange()
		},
		methods: {

            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },
            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yishengtouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },
            // 下拉变化
            yishengxingbieChange(e) {
                    this.yishengxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yishengxingbieOptions[this.yishengxingbieIndex]
            },
            // 下拉变化
            yishengkeshiChange(e) {
                    this.yishengkeshiIndex = e.target.value
                    this.ruleForm.keshi = this.yishengkeshiOptions[this.yishengkeshiIndex]
            },

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.yonghuxingming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if((!this.ruleForm.yishengzhanghao) && `yisheng` == this.tableName){
					this.$utils.msg(`医生账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yisheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yisheng` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.yishengxingming) && `yisheng` == this.tableName){
					this.$utils.msg(`医生姓名不能为空`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>

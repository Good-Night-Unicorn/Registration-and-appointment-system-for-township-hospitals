<template>
	<view :style='{"padding":"20rpx","flexWrap":"wrap","background":"#FEF9F3","display":"flex","width":"100%","position":"relative","height":"auto"}'>
		<view class="title" :style='{"borderColor":"#D1D1D1","color":"#000000","borderRadius":"10rpx 10rpx 0px 0px","textAlign":"center","background":"#fff","borderWidth":"0 0 2rpx 0","width":"100%","lineHeight":"80rpx","fontSize":"32rpx","borderStyle":"solid","order":"1"}'>{{detail.title}}</view>
		
		<view :style='{"padding":"20rpx","alignItems":"center","background":"#fff","display":"flex","width":"100%","justifyContent":"center","order":"2"}'>
		  <view :style='{"padding":"0"}'>
		    <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#858585"}'></text>
		    <text :style='{"color":"#858585","lineHeight":"1.5","fontSize":"24rpx"}'>发布时间：{{detail.addtime}}</text>
		  </view>
		  <view :style='{"padding":"0"}'>
		    <text class="icon iconfont icon-geren16" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#858585"}'></text>
		    <text :style='{"color":"#858585","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.name}}</text>
		  </view>
		  <view :style='{"padding":"0"}'>
		    <text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#858585"}'></text>
		    <text :style='{"color":"#858585","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.thumbsupnum}}</text>
		  </view>
		  <view :style='{"padding":"0"}'>
		    <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#858585"}'></text>
		    <text :style='{"color":"#858585","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.storeupnum}}</text>
		  </view>
		  <view :style='{"padding":"0"}'>
		    <text class="icon iconfont icon-chakan9" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#858585"}'></text>
		    <text :style='{"color":"#858585","lineHeight":"1.5","fontSize":"24rpx"}'>{{detail.clicknum}}</text>
		  </view>
		</view>
		
		<view :style='{"padding":"0 0 20rpx 0","background":"#fff","flex":"auto","display":"flex","width":"100%","justifyContent":"center","order":"4"}'>
		  <view :style='{"alignItems":"center","borderRadius":"0","background":"#EDEDED","display":"flex","width":"48%","justifyContent":"center","height":"60rpx"}' @click="likeClick">
		    <text class="icon iconfont" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#999898"}' :class="likeType?'icon-zan10':'icon-zan10'"></text>
		    <text :style='{"color":"#999898","lineHeight":"1.5","fontSize":"28rpx"}'>{{likeType?'已':''}}赞</text>
		  </view>
		  <view :style='{"alignItems":"center","borderRadius":"0","background":"#219BE8","display":"flex","width":"48%","justifyContent":"center","height":"60rpx"}' @click="collectClick">
		    <text class="icon iconfont" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#FFFFFF"}' :class="collectType?'icon-shoucang10':'icon-shoucang10'"></text>
		    <text :style='{"color":"#FFFFFF","lineHeight":"1.5","fontSize":"28rpx"}'>{{collectType?'已':''}}收藏</text>
		  </view>
		</view>
		
		<view class="content" :style='{"padding":"10rpx","color":"#333","background":"#fff","width":"100%","fontSize":"32rpx","lineHeight":"1.8","textIndent":"2em","height":"auto","order":"4"}'>
			<rich-text class="ql-snow ql-editor" :nodes="detail.content"></rich-text>
		</view>
		
		<div :style='{"padding":"0","background":"#fff","display":"flex","gap":"20rpx","width":"100%","justifyContent":"center","height":"auto","order":"5"}'>
		  <div @click="prepDetailClick" :style='{"margin":"0","alignItems":"center","borderRadius":"0 0 0 20rpx","color":"#999898","background":"#EDEDED","display":"flex","width":"50%","justifyContent":"center","height":"60rpx"}'>上一篇：prev</div>
		  <div @click="nextDetailClick" :style='{"margin":"0","alignItems":"center","borderRadius":"0 0  20rpx 0","color":"#FFFFFF","background":"#219BE8","display":"flex","width":"50%","justifyContent":"center","height":"60rpx"}'>下一篇：next</div>
		</div>
		

		<!-- 热门 -->
		<view class="hot" :style='{"width":"100%","background":"none","height":"auto","order":"7"}'>
		  <view :style='{"padding":"0 40rpx 0 100rpx","margin":"0","color":"#219BE8","background":"url(http://codegen.caihongy.cn/20250114/91baa970771f42dcb5dc3917a7ed5600.png) no-repeat left bottom","display":"flex","width":"100%","lineHeight":"80rpx","fontSize":"36rpx","justifyContent":"space-between","fontWeight":"700","height":"70rpx"}'>热门信息</view>
		  <view :style='{"padding":"20rpx 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
		    <view v-for="(item,index) in hotList" :key="index" :style='{"padding":"0 0 20rpx 0","margin":"0 0 20rpx","backgroundColor":"#fff","borderRadius":"60rpx 60rpx 0 0","flexWrap":"wrap","display":"flex","width":"48%","height":"auto"}' @click="toDetail(item.id)">
			  <image :style='{"padding":"0","margin":"0","objectFit":"cover","borderRadius":"20rpx","display":"block","width":"100%","height":"300rpx"}' mode="aspectFill" :src="baseUrl + item.picture"></image>
		      <view :style='{"padding":"10rpx 20rpx","color":"#4A4A4A","textAlign":"center","width":"100%","lineHeight":"1.4","fontSize":"32rpx","order":"1"}'>{{ item.title }}</view>
		      <view :style='{"padding":"0 20rpx","color":"#526FB2","textAlign":"center","width":"100%","lineHeight":"24rpx","fontSize":"24rpx","order":"2"}'>{{ item.addtime }}</view>
		    </view>
		  </view>
		</view>
		<!-- 推荐 -->
		<view class="recommend" :style='{"width":"100%","margin":"40rpx 0 0","background":"none","height":"auto","order":"8"}'>
		  <view :style='{"padding":"0 40rpx 0 100rpx","margin":"0","color":"#219BE8","background":"url(http://codegen.caihongy.cn/20250114/91baa970771f42dcb5dc3917a7ed5600.png) no-repeat left bottom","display":"flex","width":"100%","lineHeight":"80rpx","fontSize":"36rpx","justifyContent":"space-between","fontWeight":"700","height":"70rpx"}'>推荐信息</view>
		  <view :style='{"padding":"40rpx 0 0","flexWrap":"wrap","background":"none","display":"flex","gap":"20rpx","width":"100%","justifyContent":"space-between","height":"auto"}'>
		    <view v-for="(item,index) in recommendList" :key="index" :style='{"minHeight":"140rpx","padding":"20rpx 0 0 140rpx","borderRadius":"20rpx","flexWrap":"wrap","background":"#fff","display":"flex","width":"48%","position":"relative","height":"auto"}' @click="toDetail(item.id)">
		      <image :style='{"objectFit":"cover","borderRadius":"10rpx","left":"20rpx","display":"block","width":"100rpx","position":"absolute","height":"100rpx"}' mode="aspectFill" :src="baseUrl + item.picture"></image>
			  <view :style='{"padding":"0 8rpx","lineHeight":"1.5","fontSize":"28rpx","overflow":"hidden","color":"#4A4A4A"}'>{{ item.title }}</view>
		      <view :style='{"width":"100%","padding":"0 8rpx","lineHeight":"24rpx","fontSize":"24rpx","color":"#526FB2","textAlign":"center"}'>{{ item.addtime }}</view>
		    </view>
		  </view>
		</view>

	</view>
</template>
<script>
	export default {
		data() {
			return {
				detail: {},
				id: '',
				likeType: false,
				likeForm: {},
				collectType: false,
				collectForm: {},
				allList: [],
				currentIndex: 0,
				hotList: [],
				recommendList: [],
			}
		},
		async onLoad(options) {
			this.id = options.id;
			this.getInfo()
			
			this.getHotList()
			this.getRecommendList()
		},
		computed:{
			baseUrl() {
				return this.$base.url;
			},
			userid(){
				return uni.getStorageSync('appUserid')
			}
		},
		methods: {
			async getInfo(){
				let res = await this.$api.info('news', this.id)
				res.data.content = res.data.content.replace(/<img/g,'<img style="width: 100%;"');
				this.detail = res.data;
				uni.pageScrollTo({
					scrollTop: 0,
					duration: 100,
				})
				this.getLike()
				this.getCollect()
				res = await this.$api.list('news',{page:1,limit:100,sort:'addtime',order:'desc'})
				for(let x in res.data.list){
					if(res.data.list[x].id == this.id){
						this.currentIndex = Number(x)
						break
					}
				}
				this.allList = res.data.list
				
			},
			// 获取点赞状态
			async getLike() {
				let res = await this.$api.list('storeup', {
					page: 1,
					limit: 1,
					type: '21',
					userid: uni.getStorageSync('appUserid'),
					refid: this.id,
					tablename: 'news'
				})
				if (res.data.list.length) {
					this.likeType = true
					this.likeForm = res.data.list[0]
				} else {
					this.likeType = false
					this.likeForm = {}
				}
			},
			// 获取热门列表
			async getHotList(){
				let res = await this.$api.recommend('news',{page:1, limit: 4,sort:'addtime',order:'desc'})
				this.hotList = res.data.list;
			},
			// 获取推荐列表	
			async getRecommendList(){
				let res;
				if(uni.getStorageSync("appUserid")){
					res = await this.$api.recommend2('news',{page:1, limit: 4,sort:'addtime',order:'desc'})
				}else{
					res = await this.$api.recommend('news',{page:1, limit: 4,sort:'addtime',order:'desc'})
				}
				
				this.recommendList = res.data.list;
			},
			// 上一篇
			prepDetailClick(){
				if(this.currentIndex == 0){
					this.$utils.msg('已经是第一篇了')
					return false
				}
				this.currentIndex--
				this.id = this.allList[this.currentIndex].id
				this.getInfo()
			},
			// 下一篇
			nextDetailClick(){
				if(this.currentIndex == this.allList.length - 1){
					this.$utils.msg('已经是最后一篇了')
					return false
				}
				this.currentIndex++
				this.id = this.allList[this.currentIndex].id
				this.getInfo()
			},
			toDetail(id){
				this.id = id
				this.getInfo()
			},
			// 获取收藏状态
			async getCollect() {
				let res = await this.$api.list('storeup', {
					page: 1,
					limit: 1,
					type: '1',
					userid: uni.getStorageSync('appUserid'),
					refid: this.id,
					tablename: 'news'
				})
				if (res.data.list.length) {
					this.collectType = true
					this.collectForm = res.data.list[0]
				} else {
					this.collectType = false
					this.collectForm = {}
				}
			},
			// 点赞按钮
			async likeClick() {
				let that = this
				if (this.likeType) {
					uni.showModal({
						title: '提示',
						content: '是否取消点赞？',
						async success(res) {
							if (res.confirm) {
								await that.$api.del('storeup', JSON.stringify([that.likeForm.id]))
								that.$utils.msg('取消成功')
								that.detail.thumbsupnum--
								await that.$api.update('news', that.detail)
								that.getLike()
							}
						}
					})
				} else {
					await that.$api.add('storeup', {
						userid: uni.getStorageSync('appUserid'),
						refid: this.id,
						type: '21',
						name: this.detail.title,
						picture: this.detail.picture,
						tablename: 'news',
					})
					this.$utils.msg('点赞成功')
					that.detail.thumbsupnum++
					await that.$api.update('news', that.detail)
					this.getLike()
				}
			},
			// 收藏按钮
			async collectClick() {
				let that = this
				if (this.collectType) {
					uni.showModal({
						title: '提示',
						content: '是否取消收藏？',
						async success(res) {
							if (res.confirm) {
								await that.$api.del('storeup', JSON.stringify([that.collectForm.id]))
								that.$utils.msg('取消成功')
								that.detail.storeupnum--
								await that.$api.update('news', that.detail)
								that.getCollect()
							}
						}
					})
				} else {
					await that.$api.add('storeup', {
						userid: uni.getStorageSync('appUserid'),
						refid: this.id,
						type: '1',
						name: this.detail.title,
						picture: this.detail.picture,
						tablename: 'news',
					})
					this.$utils.msg('收藏成功')
					that.detail.storeupnum++
					await that.$api.update('news', that.detail)
					this.getCollect()
				}
			},
		}
	}
</script>

<style scoped lang="scss">
	page {
		background: #FFFFFF;
	}
</style>

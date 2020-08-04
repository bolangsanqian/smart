/**
 * 获取url参数
 * @param name 参数名
 * @returns {string|null} 参数值
 */
function urlParam(name) {
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
};

var vm = new Vue({
    el: '#app',
    data: {
        detail: null
    },
    methods: {
    },
    created: function () {
        loadData();
    }
})

function loadData() {
    var sn = urlParam("sn");
    mui.ajax('/detail/' + sn,{
        dataType:'json',//服务器返回json格式数据
        type:'get',//HTTP请求类型
        timeout:10000,//超时时间设置为10秒；
        headers:{'Content-Type':'application/json'},
        success:function(rs){
            console.log(rs);
            if (rs.code == 200) {
                vm.detail = rs.data;
                vm.detail.temperature = vm.detail.temperature ? vm.detail.temperature : {};
                vm.detail.humidity = vm.detail.humidity ? vm.detail.humidity : {};
                vm.detail.illumination = vm.detail.illumination ? vm.detail.illumination : {};
                vm.detail.co2 = vm.detail.co2 ? vm.detail.co2 : {};
            } else {
                console.error("设备不存在，SN: " + sn);
            }
        },
        error:function(xhr,type,errorThrown){
            console.log(type);
        }
    });
}

setInterval(function () {
    loadData();
}, 2000)



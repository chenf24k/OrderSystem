<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>卖家商品列表</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<#--<script type="text/javascript">
    window.onload = function () {
        var html = "";
        <#list orderDTOPage.content as orderDTO>
        html += "<tr>";
        html += "<td>" + ${orderDTO.orderId} +"</td>";
        html += "<td>" + ${orderDTO.buyerName} +"</td>";
        html += "<td>" + ${orderDTO.buyerPhone} +"</td>";
        html += "<td>" + ${orderDTO.buyerAddress} +"</td>";
        html += "<td>" + ${orderDTO.orderAmount} +"</td>";
        html += "<td>" + ${orderDTO.orderStatus} +"</td>";
        html += "<td>" + "微信" + "</td>";
        html += "<td>" + ${orderDTO.payStatus} +"</td>";
        html += "<td>" + ${orderDTO.createTime} +"</td>";
        html += "</tr>";
        </#list>
        document.getElementById("orderTbody").innerHTML = html;
    }
</script>-->

<div class="container">
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <blockquote>
                    <p>
                        订单列表
                    </p> <small>陈枫 <cite>订单列表</cite></small>
                </blockquote>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th>订单id</th>
                    <th>姓名</th>
                    <th>手机号</th>
                    <th>地址</th>
                    <th>金额</th>
                    <th>订单状态</th>
                    <th>支付方式</th>
                    <th>支付状态</th>
                    <th>创建时间</th>
                    <th colspan="2">操作</th>
                </tr>
                </thead>
                <#list orderDTOPage.content as orderDTO>
                    <tbody id="orderTbody">
                    <tr>
                        <td>${orderDTO.orderId}</td>
                        <td>${orderDTO.buyerName}</td>
                        <td>${orderDTO.buyerPhone}</td>
                        <td>${orderDTO.buyerAddress}</td>
                        <td>${orderDTO.orderAmount}</td>
                        <td>${orderDTO.orderStatus}</td>
                        <td>微信</td>
                        <td>${orderDTO.payStatus}</td>
                        <td>${orderDTO.createTime}</td>
                        <td>详情</td>
                        <td>取消</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>
    </div>
</div>


<br>


</body>
</html>
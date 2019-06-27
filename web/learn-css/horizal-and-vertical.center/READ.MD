# 居中样式总结

## 水平居中

### 常规box居中
1. #### 文本居中
   
    设置父级text-align:center

2. #### 图片居中
    
    子img元素设置：
 
        img{
            clear:both;
            display:block;
            margin:auto;
        } 
3. #### 顶宽box 
   
   对于定宽box  设置maring:0 auto;

        .inner{
            width:100px;
            margin:0 auto;        
        }

4. #### 通用方法
    
    父box

        .out{
            display:flex;
            justify-content:center;
        }

### 浮动box水平居中

1. 定宽浮动box水平居中:float:left;width:widthvalue;left:50%;margin-left:-(widthvalue/2)
   
        .inner-float{
            float:left;
            width:200px;
            left:50%;
            margin-left:-200/2
        }
   
2. 不定宽浮动box水平居中
   
3. 通用浮动box水平居中

### box内按列正居中

    浏览器相关，主流-webkit -moz

        .box{
            display: -webkit-box;
            -moz-box-pack: center;
            -moz-box-orient: vertical; 
        }
            or
        .box{
            display: -moz-box;
            -webkit-box-pack: center;
            -webkit-box-orient: vertical;
        }



    

    



    
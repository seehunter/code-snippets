const path=require('path');

module.exports={
    entry:'./src/index.js',
    output:{
        // filename: 'main.js',
        filename: 'bundle.js',
        path:path.resolve(__dirname,'dist')
    },
    mode:'production',
    module:{
        rules:[
            {
                test:/\.css$/,
                use:[
                    'style-loader',
                    'css-loader'
                ]
            },
            {
                test:/\.(png|jpg|jpeg|gif)$/,
                use:[
                    'file-loader'
                ]
            },
            {
                test:/\.(woff|woff2|eot|ttf|otf)$/,
                use:[
                    'file-loader'
                ]
            }
        ]
    }
}
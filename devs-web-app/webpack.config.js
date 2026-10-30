const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
  mode: 'development',
  entry: {
    app: './src/index.tsx',
    'editor.worker': 'monaco-editor-core/esm/vs/editor/editor.worker.js',
    'devsLangWorker': './src/devs-lang/devsLang.worker.ts'
  },
  output: {
    publicPath: '/a04/',
    globalObject: 'self',
    filename: (chunkData) => {
      if (chunkData.chunk.name === 'editor.worker') return 'editor.worker.js';
      if (chunkData.chunk.name === 'devsLangWorker') return 'devsLangWorker.js';
      return 'bundle.[hash].js';
    },
    path: path.resolve(__dirname, 'build')
  },
  resolve: { extensions: ['.ts', '.tsx', '.js', '.jsx', '.css'] },
  module: {
    rules: [
      { test: /\.tsx?$/, loader: 'ts-loader' },
      { test: /\.css$/, use: ['style-loader', 'css-loader'] }
    ]
  },
  plugins: [new HtmlWebpackPlugin({ template: './src/index.html' })],
  devServer: {
    port: 3000,
    hot: true,
    publicPath: '/a04/',
    historyApiFallback: { index: '/a04/' },
    openPage: 'a04/',
    proxy: { '/b04': 'http://localhost:8094' }
  }
};

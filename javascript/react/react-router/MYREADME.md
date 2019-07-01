# React note

## JSX

    JSX是一种javascript的扩展，是一种表达式，一种嵌入了javascript的html的javascript扩展

## 元素渲染

    ReactDom渲染，组件渲染

## 组件 & props

- 函数组件
- class组件
- 组件的组合
- 提取组件

## state和生命周期

### state

- state的赋值只允许在constructor函数中使用
- 不能直接修改state
- 因为 this.props 和 this.state 可能会异步更新，因此不要传入对象
  
        // Wrong
        this.setState({
        counter: this.state.counter + this.props.increment,
        });
        // Correct
        this.setState((state, props) => ({
        counter: state.counter + props.increment
        }));
        // Correct
        this.setState(function(state, props) {
        return {
            counter: state.counter + props.increment
        };
        });
- state的更新会被合并
  
        constructor(props) {
        super(props);
        this.state = {
            posts: [],
            comments: []
        };
        }
        componentDidMount() {
        fetchPosts().then(response => {
        this.setState({
            posts: response.posts
        });
        });

        fetchComments().then(response => {
        this.setState({
            comments: response.comments
                });
            });
        }
- 数据是向下流动的，即可以向子组件传入当前组件的state数据,子html中，或者向子组件的属性中传递

        <h2>It is {this.state.date.toLocaleTimeString()}.</h2>
        <FormattedDate date={this.state.date} />
        function FormattedDate(props) {
            return <h2>It is {props.date.toLocaleTimeString()}.</h2>;
        }

### 生命周期

    constructor-->render-->didmount-->willUnmount

## 事件处理

    示例：
    <a className={pageStore.state.page === 0 ? 'active' : ''} href="#" onClick={this.handleClick.bind(this, 0)}>

    <button onClick={() => store.resetState()}>Reset store</button>

    <button onClick={e => this.iterateStateValue(e)}>

    private iterateStateValue(e) {
        e.preventDefault();
        this.setState({
                items: this.state.items.concat({value: Math.random()}),
        });
    }

    private handleClick(id,e) {
                e.preventDefault();
                pageStore.setState({
                page: id,
            });
    }

## 条件渲染

## 列表和key

## 表单

## 状态提升

## 组合 & 继承

## React哲学

## 特殊的保存数据的对象state

### 知识点

    异步网络请求，ui绘制，ui交互    程序调试

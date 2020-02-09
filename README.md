# spring-cloud-zipkin-demo

#### 介绍


测试成功；
* 访问consumer1 --》consumer,json反映了下面的请求逻辑：
* 1、consumer1作为服务端接收浏览器请求；
* 2、consumer1作为客户端访问consumer；
* 3、consumer作为服务端被访问；
* 通过：http://localhost:9411/zipkin/traces/935540645930e34f可以看到调用的层级关系，每个层级耗时

* [json:]

* [
  {
    "traceId": "935540645930e34f",
    "parentId": "935540645930e34f",
    "id": "2ac7a2e96f58e9fc",
    "kind": "SERVER",
    "name": "get /index",
    "timestamp": 1581238615782158,
    "duration": 5335,
    "localEndpoint": {
      "serviceName": "consumer",
      "ipv4": "172.18.97.81"
    },
    "remoteEndpoint": {
      "ipv4": "127.0.0.1",
      "port": 52352
    },
    "tags": {
      "http.method": "GET",
      "http.path": "/index",
      "mvc.controller.class": "ConsumerApplication",
      "mvc.controller.method": "index"
    },
    "shared": true
  },
  {
    "traceId": "935540645930e34f",
    "parentId": "935540645930e34f",
    "id": "2ac7a2e96f58e9fc",
    "kind": "CLIENT",
    "name": "get",
    "timestamp": 1581238615767246,
    "duration": 17957,
    "localEndpoint": {
      "serviceName": "consumer1",
      "ipv4": "172.18.97.81"
    },
    "tags": {
      "http.method": "GET",
      "http.path": "/index"
    }
  },
  {
    "traceId": "935540645930e34f",
    "id": "935540645930e34f",
    "kind": "SERVER",
    "name": "get /index",
    "timestamp": 1581238615765246,
    "duration": 40434,
    "localEndpoint": {
      "serviceName": "consumer1",
      "ipv4": "172.18.97.81"
    },
    "remoteEndpoint": {
      "ipv6": "::1",
      "port": 52350
    },
    "tags": {
      "http.method": "GET",
      "http.path": "/index",
      "mvc.controller.class": "ConsumerApplication",
      "mvc.controller.method": "index"
    }
  }
]

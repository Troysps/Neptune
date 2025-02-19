/*
 * Copyright (c) 2022 The Neptune Project
 *
 * Licensed under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neptune.transport;

import org.neptune.core.core.InvokeFuture;
import io.netty.channel.Channel;

import java.net.SocketAddress;

/**
 * org.neptune.core.transportLayer - Connection
 * 抽象出来channel对象
 * 1. 后续可以基于这个对象为channel可选的添加listener
 * 2. 添加统一的管理入口, 如重连关闭或者其他的;
 *
 * @author tony-is-coding
 * @date 2021/12/16 16:57
 */
public interface Connection extends ConnectFuture {
    SocketAddress remoteAddress();

    boolean needReconnect();

    void setReconnect(boolean reconnect);
    
    void disconnect();

    Channel channel();
}

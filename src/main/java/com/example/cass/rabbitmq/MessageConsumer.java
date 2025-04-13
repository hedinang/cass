package com.example.cass.rabbitmq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class MessageConsumer {
//    private final ThreadPoolConfig threadPoolConfig;
//    private static final ConcurrentHashMap<String, ReentrantLock> locks = new ConcurrentHashMap<>();
//    private final TaskService taskService;
//
//    @RabbitListener(queues = {"${queue.chat.queue.comment}"}, errorHandler = "rabbitmqListenerHandler")
//    public void comment(CommentRequest request) {
//        ReentrantLock lock = locks.computeIfAbsent(request.getTaskCode().toString(), k -> new ReentrantLock());
//        threadPoolConfig.getCommentConsumerThreadPool().execute(() -> {
//            lock.lock();
//            try {
//                taskService.createComment(request);
//            } finally {
//                lock.unlock();
//            }
//        });
//
//    }

}
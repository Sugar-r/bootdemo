package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Ticket;
import com.company.springboot.train.dao.TicketMapper;
import com.company.springboot.train.service.ITicketService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mona
 * @since 2020-08-10
 */
@Service("ticketService")
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements ITicketService {

}

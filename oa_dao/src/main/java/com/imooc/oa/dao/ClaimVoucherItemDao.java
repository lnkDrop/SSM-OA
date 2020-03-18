package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/12/14.
 */
@Repository("claimVoucherItemDao")
public interface ClaimVoucherItemDao {
    void insert(ClaimVoucherItem claimVoucherItem);

    void update(ClaimVoucherItem claimVoucherItem);

    void delete(Integer id);

    List<ClaimVoucherItem> selectByClaimVoucher(Integer cvid);
}

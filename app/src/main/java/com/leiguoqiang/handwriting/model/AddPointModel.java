package com.leiguoqiang.handwriting.model;

/**
 * @author leiguoqiang
 * contact: 274764936
 * 新增点模型：解决相邻两段，线条宽度过大，过渡不平滑问题
 * 原理：微分原理，在一定的长度范围内（可能需要设定阈值），新增多个梯度点，形成平滑效果
 * 注意：在笔画宽度模型中，已经进行了第一步过滤（过滤掉：宽度变化大，距离短的场景，以细微变化去处理）
 */
public class AddPointModel {
    // TODO: 2019/11/17
    /**
     * 如果全部线段都采用贝塞尔曲线进行绘制，采用微分原理暂且没有很好的实现
     *
     * 不完美的解决方案，此处的线条用直线进行连接，暂不实现
     */


}

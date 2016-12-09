// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

public interface PredictResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deepwater.PredictResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .deepwater.Tensor fetches = 1;</code>
   */
  java.util.List<ai.h2o.deepwater.backends.grpc.Tensor> 
      getFetchesList();
  /**
   * <code>repeated .deepwater.Tensor fetches = 1;</code>
   */
  ai.h2o.deepwater.backends.grpc.Tensor getFetches(int index);
  /**
   * <code>repeated .deepwater.Tensor fetches = 1;</code>
   */
  int getFetchesCount();
  /**
   * <code>repeated .deepwater.Tensor fetches = 1;</code>
   */
  java.util.List<? extends ai.h2o.deepwater.backends.grpc.TensorOrBuilder> 
      getFetchesOrBuilderList();
  /**
   * <code>repeated .deepwater.Tensor fetches = 1;</code>
   */
  ai.h2o.deepwater.backends.grpc.TensorOrBuilder getFetchesOrBuilder(
      int index);

  /**
   * <code>optional .deepwater.Status status = 2;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional .deepwater.Status status = 2;</code>
   */
  ai.h2o.deepwater.backends.grpc.Status getStatus();
  /**
   * <code>optional .deepwater.Status status = 2;</code>
   */
  ai.h2o.deepwater.backends.grpc.StatusOrBuilder getStatusOrBuilder();
}

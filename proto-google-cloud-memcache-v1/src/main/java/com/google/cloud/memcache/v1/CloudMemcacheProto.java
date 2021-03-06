/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/memcache/v1/cloud_memcache.proto

package com.google.cloud.memcache.v1;

public final class CloudMemcacheProto {
  private CloudMemcacheProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_NodeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_NodeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_Node_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_Node_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_ApplyParametersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_UpdateParametersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_UpdateParametersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_MemcacheParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_memcache_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_memcache_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/memcache/v1/cloud_memcach"
          + "e.proto\022\030google.cloud.memcache.v1\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032#google/lon"
          + "grunning/operations.proto\032 google/protob"
          + "uf/field_mask.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\243\014\n\010Instance\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\002\022\024\n\014display_name\030\002 \001(\t\022>\n\006labels\030\003 \003"
          + "(\0132..google.cloud.memcache.v1.Instance.L"
          + "abelsEntry\022\032\n\022authorized_network\030\004 \001(\t\022\r"
          + "\n\005zones\030\005 \003(\t\022\027\n\nnode_count\030\006 \001(\005B\003\340A\002\022G"
          + "\n\013node_config\030\007 \001(\0132-.google.cloud.memca"
          + "che.v1.Instance.NodeConfigB\003\340A\002\022C\n\020memca"
          + "che_version\030\t \001(\0162).google.cloud.memcach"
          + "e.v1.MemcacheVersion\022@\n\nparameters\030\013 \001(\013"
          + "2,.google.cloud.memcache.v1.MemcachePara"
          + "meters\022D\n\016memcache_nodes\030\014 \003(\0132\'.google."
          + "cloud.memcache.v1.Instance.NodeB\003\340A\003\0224\n\013"
          + "create_time\030\r \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0224\n\013update_time\030\016 \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\022<\n\005state\030\017 \001(\0162"
          + "(.google.cloud.memcache.v1.Instance.Stat"
          + "eB\003\340A\003\022\"\n\025memcache_full_version\030\022 \001(\tB\003\340"
          + "A\003\022M\n\021instance_messages\030\023 \003(\01322.google.c"
          + "loud.memcache.v1.Instance.InstanceMessag"
          + "e\022\037\n\022discovery_endpoint\030\024 \001(\tB\003\340A\003\032A\n\nNo"
          + "deConfig\022\026\n\tcpu_count\030\001 \001(\005B\003\340A\002\022\033\n\016memo"
          + "ry_size_mb\030\002 \001(\005B\003\340A\002\032\257\002\n\004Node\022\024\n\007node_i"
          + "d\030\001 \001(\tB\003\340A\003\022\021\n\004zone\030\002 \001(\tB\003\340A\003\022A\n\005state"
          + "\030\003 \001(\0162-.google.cloud.memcache.v1.Instan"
          + "ce.Node.StateB\003\340A\003\022\021\n\004host\030\004 \001(\tB\003\340A\003\022\021\n"
          + "\004port\030\005 \001(\005B\003\340A\003\022@\n\nparameters\030\006 \001(\0132,.g"
          + "oogle.cloud.memcache.v1.MemcacheParamete"
          + "rs\"S\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CR"
          + "EATING\020\001\022\t\n\005READY\020\002\022\014\n\010DELETING\020\003\022\014\n\010UPD"
          + "ATING\020\004\032\251\001\n\017InstanceMessage\022E\n\004code\030\001 \001("
          + "\01627.google.cloud.memcache.v1.Instance.In"
          + "stanceMessage.Code\022\017\n\007message\030\002 \001(\t\">\n\004C"
          + "ode\022\024\n\020CODE_UNSPECIFIED\020\000\022 \n\034ZONE_DISTRI"
          + "BUTION_UNBALANCED\020\001\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"a\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READ"
          + "Y\020\002\022\014\n\010DELETING\020\004\022\032\n\026PERFORMING_MAINTENA"
          + "NCE\020\005:c\352A`\n memcache.googleapis.com/Inst"
          + "ance\022<projects/{project}/locations/{loca"
          + "tion}/instances/{instance}\"\232\001\n\024ListInsta"
          + "ncesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!loc"
          + "ations.googleapis.com/Location\022\021\n\tpage_s"
          + "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030"
          + "\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"|\n\025ListInstances"
          + "Response\0225\n\tinstances\030\001 \003(\0132\".google.clo"
          + "ud.memcache.v1.Instance\022\027\n\017next_page_tok"
          + "en\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"L\n\022GetInst"
          + "anceRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n memca"
          + "che.googleapis.com/Instance\"\247\001\n\025CreateIn"
          + "stanceRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!l"
          + "ocations.googleapis.com/Location\022\030\n\013inst"
          + "ance_id\030\002 \001(\tB\003\340A\002\0229\n\010instance\030\003 \001(\0132\".g"
          + "oogle.cloud.memcache.v1.InstanceB\003\340A\002\"\210\001"
          + "\n\025UpdateInstanceRequest\0224\n\013update_mask\030\001"
          + " \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\0229\n"
          + "\010instance\030\002 \001(\0132\".google.cloud.memcache."
          + "v1.InstanceB\003\340A\002\"O\n\025DeleteInstanceReques"
          + "t\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n memcache.google"
          + "apis.com/Instance\"u\n\026ApplyParametersRequ"
          + "est\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n memcache.goog"
          + "leapis.com/Instance\022\020\n\010node_ids\030\002 \003(\t\022\021\n"
          + "\tapply_all\030\003 \001(\010\"\311\001\n\027UpdateParametersReq"
          + "uest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n memcache.goo"
          + "gleapis.com/Instance\0224\n\013update_mask\030\002 \001("
          + "\0132\032.google.protobuf.FieldMaskB\003\340A\002\022@\n\npa"
          + "rameters\030\003 \001(\0132,.google.cloud.memcache.v"
          + "1.MemcacheParameters\"\236\001\n\022MemcacheParamet"
          + "ers\022\017\n\002id\030\001 \001(\tB\003\340A\003\022H\n\006params\030\003 \003(\01328.g"
          + "oogle.cloud.memcache.v1.MemcacheParamete"
          + "rs.ParamsEntry\032-\n\013ParamsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\371\001\n\021OperationMetad"
          + "ata\0224\n\013create_time\030\001 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003"
          + " \001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\032\n\rstatus_d"
          + "etail\030\005 \001(\tB\003\340A\003\022\035\n\020cancel_requested\030\006 \001"
          + "(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\003*E\n\017Mem"
          + "cacheVersion\022 \n\034MEMCACHE_VERSION_UNSPECI"
          + "FIED\020\000\022\020\n\014MEMCACHE_1_5\020\0012\202\016\n\rCloudMemcac"
          + "he\022\260\001\n\rListInstances\022..google.cloud.memc"
          + "ache.v1.ListInstancesRequest\032/.google.cl"
          + "oud.memcache.v1.ListInstancesResponse\">\202"
          + "\323\344\223\002/\022-/v1/{parent=projects/*/locations/"
          + "*}/instances\332A\006parent\022\235\001\n\013GetInstance\022,."
          + "google.cloud.memcache.v1.GetInstanceRequ"
          + "est\032\".google.cloud.memcache.v1.Instance\""
          + "<\202\323\344\223\002/\022-/v1/{name=projects/*/locations/"
          + "*/instances/*}\332A\004name\022\222\002\n\016CreateInstance"
          + "\022/.google.cloud.memcache.v1.CreateInstan"
          + "ceRequest\032\035.google.longrunning.Operation"
          + "\"\257\001\202\323\344\223\0029\"-/v1/{parent=projects/*/locati"
          + "ons/*}/instances:\010instance\332A\033parent,inst"
          + "ance,instance_id\312AO\n!google.cloud.memcac"
          + "he.v1.Instance\022*google.cloud.memcache.v1"
          + ".OperationMetadata\022\224\002\n\016UpdateInstance\022/."
          + "google.cloud.memcache.v1.UpdateInstanceR"
          + "equest\032\035.google.longrunning.Operation\"\261\001"
          + "\202\323\344\223\002B26/v1/{instance.name=projects/*/lo"
          + "cations/*/instances/*}:\010instance\332A\024insta"
          + "nce,update_mask\312AO\n!google.cloud.memcach"
          + "e.v1.Instance\022*google.cloud.memcache.v1."
          + "OperationMetadata\022\240\002\n\020UpdateParameters\0221"
          + ".google.cloud.memcache.v1.UpdateParamete"
          + "rsRequest\032\035.google.longrunning.Operation"
          + "\"\271\001\202\323\344\223\002C2>/v1/{name=projects/*/location"
          + "s/*/instances/*}:updateParameters:\001*\332A\033n"
          + "ame,update_mask,parameters\312AO\n!google.cl"
          + "oud.memcache.v1.Instance\022*google.cloud.m"
          + "emcache.v1.OperationMetadata\022\345\001\n\016DeleteI"
          + "nstance\022/.google.cloud.memcache.v1.Delet"
          + "eInstanceRequest\032\035.google.longrunning.Op"
          + "eration\"\202\001\202\323\344\223\002/*-/v1/{name=projects/*/l"
          + "ocations/*/instances/*}\332A\004name\312AC\n\025googl"
          + "e.protobuf.Empty\022*google.cloud.memcache."
          + "v1.OperationMetadata\022\231\002\n\017ApplyParameters"
          + "\0220.google.cloud.memcache.v1.ApplyParamet"
          + "ersRequest\032\035.google.longrunning.Operatio"
          + "n\"\264\001\202\323\344\223\002B\"=/v1/{name=projects/*/locatio"
          + "ns/*/instances/*}:applyParameters:\001*\332A\027n"
          + "ame,node_ids,apply_all\312AO\n!google.cloud."
          + "memcache.v1.Instance\022*google.cloud.memca"
          + "che.v1.OperationMetadata\032K\312A\027memcache.go"
          + "ogleapis.com\322A.https://www.googleapis.co"
          + "m/auth/cloud-platformBv\n\034com.google.clou"
          + "d.memcache.v1B\022CloudMemcacheProtoP\001Z@goo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/memcache/v1;memcacheb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_memcache_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_memcache_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Labels",
              "AuthorizedNetwork",
              "Zones",
              "NodeCount",
              "NodeConfig",
              "MemcacheVersion",
              "Parameters",
              "MemcacheNodes",
              "CreateTime",
              "UpdateTime",
              "State",
              "MemcacheFullVersion",
              "InstanceMessages",
              "DiscoveryEndpoint",
            });
    internal_static_google_cloud_memcache_v1_Instance_NodeConfig_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_memcache_v1_Instance_NodeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_NodeConfig_descriptor,
            new java.lang.String[] {
              "CpuCount", "MemorySizeMb",
            });
    internal_static_google_cloud_memcache_v1_Instance_Node_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_memcache_v1_Instance_Node_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_Node_descriptor,
            new java.lang.String[] {
              "NodeId", "Zone", "State", "Host", "Port", "Parameters",
            });
    internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_InstanceMessage_descriptor,
            new java.lang.String[] {
              "Code", "Message",
            });
    internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_memcache_v1_Instance_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_memcache_v1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_memcache_v1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_memcache_v1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_memcache_v1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_memcache_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_memcache_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_memcache_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_memcache_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance",
            });
    internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_memcache_v1_ApplyParametersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_ApplyParametersRequest_descriptor,
            new java.lang.String[] {
              "Name", "NodeIds", "ApplyAll",
            });
    internal_static_google_cloud_memcache_v1_UpdateParametersRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_memcache_v1_UpdateParametersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_UpdateParametersRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Parameters",
            });
    internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_memcache_v1_MemcacheParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor,
            new java.lang.String[] {
              "Id", "Params",
            });
    internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_descriptor =
        internal_static_google_cloud_memcache_v1_MemcacheParameters_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_MemcacheParameters_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_memcache_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_memcache_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_memcache_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

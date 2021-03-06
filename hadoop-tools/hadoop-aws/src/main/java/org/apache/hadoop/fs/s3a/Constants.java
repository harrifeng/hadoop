/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.fs.s3a;


public class Constants {

  // number of simultaneous connections to s3
  public static final String MAXIMUM_CONNECTIONS = "fs.s3a.connection.maximum";
  public static final int DEFAULT_MAXIMUM_CONNECTIONS = 15;
  
  // connect to s3 over ssl?
  public static final String SECURE_CONNECTIONS = "fs.s3a.connection.ssl.enabled";
  public static final boolean DEFAULT_SECURE_CONNECTIONS = true;
  
  // number of times we should retry errors
  public static final String MAX_ERROR_RETRIES = "fs.s3a.attempts.maximum";
  public static final int DEFAULT_MAX_ERROR_RETRIES = 10;
  
  // seconds until we give up on a connection to s3
  public static final String SOCKET_TIMEOUT = "fs.s3a.connection.timeout";
  public static final int DEFAULT_SOCKET_TIMEOUT = 50000;

  // number of records to get while paging through a directory listing
  public static final String MAX_PAGING_KEYS = "fs.s3a.paging.maximum";
  public static final int DEFAULT_MAX_PAGING_KEYS = 5000;

  // size of each of or multipart pieces in bytes
  public static final String MULTIPART_SIZE = "fs.s3a.multipart.size";
  public static final long DEFAULT_MULTIPART_SIZE = 104857600; // 100 MB
  
  // minimum size in bytes before we start a multipart uploads or copy
  public static final String MIN_MULTIPART_THRESHOLD = "fs.s3a.multipart.threshold";
  public static final int DEFAULT_MIN_MULTIPART_THRESHOLD = Integer.MAX_VALUE;
  
  // comma separated list of directories
  public static final String BUFFER_DIR = "fs.s3a.buffer.dir";

  // private | public-read | public-read-write | authenticated-read | 
  // log-delivery-write | bucket-owner-read | bucket-owner-full-control
  public static final String CANNED_ACL = "fs.s3a.acl.default";
  public static final String DEFAULT_CANNED_ACL = "";

  // should we try to purge old multipart uploads when starting up
  public static final String PURGE_EXISTING_MULTIPART = "fs.s3a.multipart.purge";
  public static final boolean DEFAULT_PURGE_EXISTING_MULTIPART = false;

  // purge any multipart uploads older than this number of seconds
  public static final String PURGE_EXISTING_MULTIPART_AGE = "fs.s3a.multipart.purge.age";
  public static final long DEFAULT_PURGE_EXISTING_MULTIPART_AGE = 14400;

  // s3 server-side encryption
  public static final String SERVER_SIDE_ENCRYPTION_ALGORITHM = 
    "fs.s3a.server-side-encryption-algorithm";
  
  public static final String S3N_FOLDER_SUFFIX = "_$folder$";
  public static final String FS_S3A_BLOCK_SIZE = "fs.s3a.block.size";
  public static final String FS_S3A = "s3a";
}

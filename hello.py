# class FileErrorCustom(Exception):
#     """Base class for file-related custom exceptions."""
#     pass

# class FileNotFoundErrorCustom(FileErrorCustom):
#     def __init__(self, filename):
#         super().__init__(f"Error: The file '{filename}' was not found.")

# class FilePermissionErrorCustom(FileErrorCustom):
#     def __init__(self, filename):
#         super().__init__(f"Error: Insufficient permissions to access '{filename}'.")

# class EmptyFileErrorCustom(FileErrorCustom):
#     def __init__(self, filename):
#         super().__init__(f"Error: The file '{filename}' is empty.")

# def read_file(filename):
#     try:
#         with open(filename, 'r') as file:
#             content = file.read().strip()
#             if not content:
#                 raise EmptyFileErrorCustom(filename)
#             return content
#     except FileNotFoundError:
#         raise FileNotFoundErrorCustom(filename)
#     except PermissionError:
#         raise FilePermissionErrorCustom(filename)

# if __name__ == "__main__":
#     filename = "example.txt"  # Change this to test different cases
#     try:
#         file_content = read_file(filename)
#         print("File Content:")
#         print(file_content)
#     except FileErrorCustom as e:
#         print(e)
import numpy as np

# Create arrays
zeros_array = np.zeros(10, dtype=int)   # 10 zeros
ones_array = np.ones(10, dtype=int)     # 10 ones
fives_array = np.full(10, 5, dtype=int) # 10 fives

# Concatenate all arrays into one
final_array = np.concatenate([zeros_array, ones_array, fives_array])

# Print the result
print(final_array)

